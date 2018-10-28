package com.example.moneybook.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.moneybook.dto.CommonCodeRequest;
import com.example.moneybook.dto.CommonCodeResponse;
import com.example.moneybook.model.CommonCode;
import com.example.moneybook.repository.CommonCodeRepository;

@Service
public class CommonCodeService {
    @Autowired
    private CommonCodeRepository codeRepo;

    @Transactional
    public CommonCode addCommonCode(CommonCodeRequest request) {
        CommonCode code = new CommonCode();
        code.setDescription(request.getDescription());
        code.setName(request.getName());
        code.setParentId(request.getParentId());
        code.setSorting(request.getSorting());

        code.setCreatedAt(new Date());

        CommonCode newCord = codeRepo.save(code);
        return newCord;
    }

    public CommonCodeResponse getCommonCode() {

        CommonCodeResponse response = new CommonCodeResponse();
        List<CommonCode> codes = codeRepo.findByParentIdIsOrderBySortingAsc(0);
        response.setCode(codes);
        for (CommonCode code : codes) {
            List<CommonCode> subCodes = codeRepo.findByParentIdIsOrderBySortingAsc(code.getId());
            for (CommonCode subCode: subCodes) {
                response.getSubCode().add(subCode);
            }
        }
        return response;
    }

    @Transactional
    public CommonCode updateCommonCode(int id, CommonCodeRequest request) {
        CommonCode code = codeRepo.findOne(id);

        code.setDescription(request.getDescription());
        code.setName(request.getName());
        code.setParentId(request.getParentId());
        code.setSorting(request.getSorting());

        code.setUpdateAt(new Date());
        
        CommonCode newCord = codeRepo.save(code);
        return newCord;
    }

    @Transactional
    public void deleteCommonCode(Integer id) {
        codeRepo.delete(id);
    }
}
