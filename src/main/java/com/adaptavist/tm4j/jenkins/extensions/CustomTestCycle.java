package com.adaptavist.tm4j.jenkins.extensions;

import org.kohsuke.stapler.DataBoundConstructor;

public class CustomTestCycle {
    private String testCycleName;
    private String testCycleDescription;
    private Long testCycleJiraProjectVersionId;
    private Long testCycleFolderId;
    private String testCycleCustomFields;

//    "customizeTestCycle":{"testCycleName":"Jenkins Test Cycle","testCycleDescription":"Created From Jenkins","testCycleJiraProjectVersionId":"10006","testCycleFolderId":"3040527","testCycleCustomFields":""}

    @DataBoundConstructor
    public CustomTestCycle(
        final String testCycleName,
        final String testCycleDescription,
        final Long testCycleJiraProjectVersionId,
        final Long testCycleFolderId,
        final String testCycleCustomFields
    ) {
        this.testCycleName = testCycleName;
        this.testCycleDescription = testCycleDescription;
        this.testCycleJiraProjectVersionId = testCycleJiraProjectVersionId;
        this.testCycleFolderId = testCycleFolderId;
        this.testCycleCustomFields = testCycleCustomFields;
    }

    public String getTestCycleName() {
        return testCycleName;
    }

    public void setTestCycleName(String testCycleName) {
        this.testCycleName = testCycleName;
    }

    public String getTestCycleDescription() {
        return testCycleDescription;
    }

    public void setTestCycleDescription(String testCycleDescription) {
        this.testCycleDescription = testCycleDescription;
    }

    public Long getTestCycleJiraProjectVersionId() {
        return testCycleJiraProjectVersionId;
    }

    public void setTestCycleJiraProjectVersionId(Long testCycleJiraProjectVersionId) {
        this.testCycleJiraProjectVersionId = testCycleJiraProjectVersionId;
    }

    public Long getTestCycleFolderId() {
        return testCycleFolderId;
    }

    public void setTestCycleFolderId(Long testCycleFolderId) {
        this.testCycleFolderId = testCycleFolderId;
    }

    public String getTestCycleCustomFields() {
        return testCycleCustomFields;
    }

    public void setTestCycleCustomFields(String testCycleCustomFields) {
        this.testCycleCustomFields = testCycleCustomFields;
    }

    @Override
    public String toString() {
        return "CustomTestCycle={\n" +
            "    testCycleName = " + testCycleName + "\n" +
            "    testCycleDescription = " + testCycleDescription + "\n" +
            "    testCycleJiraProjectVersionId = " + testCycleJiraProjectVersionId + "\n" +
            "    testCycleFolderId = " + testCycleFolderId + "\n" +
            "    testCycleCustomFields = " + testCycleCustomFields + "\n" +
            "}";
    }
}
