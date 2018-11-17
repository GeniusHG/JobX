/**
 * Copyright (c) 2015 The JobX Project
 * <p>
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.jobxhub.service.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class JobDependencyEntity implements Serializable {

    private Long dependencyId;

    //属于哪个工作流
    private Long flowId;

    //作业来源(1:来自已有的,2:来自现场定义的)
    private Integer source;

    //当前作业ID
    private Long targetId;

    //当前作业类型(1:作业,2:作业流)
    private Integer targetType;

    //上级依赖ID
    private Long parentId;

    //上级依赖作业类型(1:作业,2:作业流)
    private Integer parentType;

}
