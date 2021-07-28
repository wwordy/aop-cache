package com.netease.wwordy.consumer.aspect;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 * @author liuwangwang@corp.netease.com
 * @date 2021/7/4
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@SuperBuilder
public abstract class CheckResult implements Serializable {
    private static final long serialVersionUID = 1359699992761880303L;
    private String requestId;
}
