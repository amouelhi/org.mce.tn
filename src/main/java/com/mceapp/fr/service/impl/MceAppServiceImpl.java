package com.mceapp.fr.service.impl;

import com.mceapp.fr.service.MceAppService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MceAppServiceImpl implements MceAppService {

    private final Logger log = LoggerFactory.getLogger(MceAppServiceImpl.class);

}
