package com.agencia.viajes.agencia.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.agencia.viajes.agencia.controller.dto.AdminGeneralDto;


public interface AdminGeneralService {
    List<AdminGeneralDto> getAdminsGeneral();
}
