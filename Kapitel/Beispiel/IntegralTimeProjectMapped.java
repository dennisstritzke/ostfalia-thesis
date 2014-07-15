@Override
public boolean shouldDisplay(Map<String, Object> context) {
    if (context != null) {
        JiraHelper jiraHelper = (JiraHelper) context.get("helper");
        project = jiraHelper.getProjectObject();
    }

    try {
         timeToJiraProjectService.getMapping(project.getId());
         return true;
    } catch (DataSetNotFound dataSetNotFound) {
        return false;
    }
}