package com.recon.community.service.impl;

import com.recon.community.service.ActivityProgramService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author daniel.xue
 * @create 2018/8/2
 **/
@Service
@Transactional(rollbackFor = Throwable.class)
public class ActivityProgramServiceImpl implements ActivityProgramService {
}
