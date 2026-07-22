package com.anderk222.hire.flow.evaluation.domain.model;

/**
 * Refleja a propósito {@code interview.domain.model.InterviewType} en vez
 * de reutilizarlo: los módulos siguen siendo independientemente
 * desplegables/probables y solo comparten un primitivo (el interviewId)
 * a través del límite.
 */
public enum EvaluationType {
    HR,
    TECHNICAL,
    HIRING_MANAGER
}
