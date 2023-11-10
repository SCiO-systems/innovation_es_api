package innovation.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class InnovationMainRootUpdated {
    private String innovation_uuid;
    private int innovation_image_id;

    private String mel_user_id_who_reported_innovation;

    private int mel_id_single;

    private int mel_version_id_single;

    private List<String> mel_ids_of_related_innovations;

    private List<Integer> user_id;

    private String innovation_common_name;

    private String long_innovation_description;

    private List<String> business_category;

    private List<String> related_keywords;

    private String innovation_url;

    private String innovation_image;

    private String innovation_image_component;

    private List<String> technical_fields;

//    private List<String> innovation_type;

    private List<String> innovation_type_old;

    private List<String> innovation_type_new;

    private List<String> gov_type_of_solution;

    private List<String> intervention_long_name;

    private List<String> intervention_short_name;

    private List<String> intervention_full_name;

    private int intervention_total_budget;

    private List<String> intervention_team_members;

    private String challenge_statement;

    private String objective_statement;

    private String long_intervention_description;

    private List<String> CGIAR_action_areas_name;

    private String submitter_company_name;

    private String submitter_email;

    private String submitter_country;

    private String submitter_website;

    private String organizational_logo;

    private String submitter_first_name;

    private String submitter_last_name;

    private List<String> key_innovation_partners;

    private List<String> key_scaling_partners;

    private List<String> key_demand_partners;

    private List<String> locations_of_implementation;    //countries

    private List<Integer> work_start_date;

    private List<Integer> work_end_date;

    private List<String> problem_to_be_solved;

    private List<String> SDG_targets;

    private List<String> CGIAR_impact_targets;

    private List<String> initiative_defined_outcome;

    private List<String> environmental_benefits;

    private String technology_dev_stage;

    private String technology_dev_project_summary;

    private List<String> innovation_readiness_levels_of_component;

    private List<String> applied_evidence_locations;

    private List<String> experimental_evidence_locations;

    private List<String> impact_evidence_locations;

    private List<String> innovation_reference_materials;

    private String technology_appraisal;

    private String technology_appraisal_image;

    private List<String> documentation;

    private String patent_member_type;

    private int patent_number;

    private String patent_office;

    private String patent_know_how_info;

    private List<String> administrative_scale_of_innovations;

    private List<String> innovation_users;

    private List<String> innovation_beneficiaries;

    @JsonProperty("innovation_sponsors")
    private String innovation_sponsors;

    private String value_added;

    private String main_advantages;

    private String main_disadvantages;

    private String investment_sought;

    private List<String> investment_sought_type;

    private int estimated_amount_sought;

    private List<String> innovation_use_levels_of_components;

    private int scaling_readiness_level;

    private double scaling_readiness_score;

    //    Last adding fields after meeting
    private String HDL = "";

    //    Will i keep this or it will be ine field with countries (region)
    private List<String> region;

    private List<String> impact_areas;

    private String organizations = "";

//    private List<AggregationModel> aggregation_models;

    private List<SDGName> SDG;

    private String last_updated;

//    private Timestamp last_updated_timestamp;

    private List<SdgTargetUI> sdg_target_ui;

    private String phrase_suggester;

    private  String completion_suggester;

    private String term_suggester;

    private String ngram_tokenizer;


    public InnovationMainRootUpdated() {
    }

    public InnovationMainRootUpdated(String innovation_uuid, int innovation_image_id, String mel_user_id_who_reported_innovation, int mel_id_single, int mel_version_id_single, List<String> mel_ids_of_related_innovations, List<Integer> user_id, String innovation_common_name, String long_innovation_description, List<String> business_category, List<String> related_keywords, String innovation_url, String innovation_image, String innovation_image_component, List<String> technical_fields, List<String> innovation_type_old, List<String> innovation_type_new, List<String> gov_type_of_solution, List<String> intervention_long_name, List<String> intervention_short_name, List<String> intervention_full_name, int intervention_total_budget, List<String> intervention_team_members, String challenge_statement, String objective_statement, String long_intervention_description, List<String> CGIAR_action_areas_name, String submitter_company_name, String submitter_email, String submitter_country, String submitter_website, String organizational_logo, String submitter_first_name, String submitter_last_name, List<String> key_innovation_partners, List<String> key_scaling_partners, List<String> key_demand_partners, List<String> locations_of_implementation, List<Integer> work_start_date, List<Integer> work_end_date, List<String> problem_to_be_solved, List<String> SDG_targets, List<String> CGIAR_impact_targets, List<String> initiative_defined_outcome, List<String> environmental_benefits, String technology_dev_stage, String technology_dev_project_summary, List<String> innovation_readiness_levels_of_component, List<String> applied_evidence_locations, List<String> experimental_evidence_locations, List<String> impact_evidence_locations, List<String> innovation_reference_materials, String technology_appraisal, String technology_appraisal_image, List<String> documentation, String patent_member_type, int patent_number, String patent_office, String patent_know_how_info, List<String> administrative_scale_of_innovations, List<String> innovation_users, List<String> innovation_beneficiaries, String innovation_sponsors, String value_added, String main_advantages, String main_disadvantages, String investment_sought, List<String> investment_sought_type, int estimated_amount_sought, List<String> innovation_use_levels_of_components, int scaling_readiness_level, double scaling_readiness_score, String HDL, List<String> region, List<String> impact_areas, String organizations, List<SDGName> SDG, String last_updated, List<SdgTargetUI> sdg_target_ui, String phrase_suggester, String completion_suggester, String term_suggester, String ngram_tokenizer) {
        this.innovation_uuid = innovation_uuid;
        this.innovation_image_id = innovation_image_id;
        this.mel_user_id_who_reported_innovation = mel_user_id_who_reported_innovation;
        this.mel_id_single = mel_id_single;
        this.mel_version_id_single = mel_version_id_single;
        this.mel_ids_of_related_innovations = mel_ids_of_related_innovations;
        this.user_id = user_id;
        this.innovation_common_name = innovation_common_name;
        this.long_innovation_description = long_innovation_description;
        this.business_category = business_category;
        this.related_keywords = related_keywords;
        this.innovation_url = innovation_url;
        this.innovation_image = innovation_image;
        this.innovation_image_component = innovation_image_component;
        this.technical_fields = technical_fields;
        this.innovation_type_old = innovation_type_old;
        this.innovation_type_new = innovation_type_new;
        this.gov_type_of_solution = gov_type_of_solution;
        this.intervention_long_name = intervention_long_name;
        this.intervention_short_name = intervention_short_name;
        this.intervention_full_name = intervention_full_name;
        this.intervention_total_budget = intervention_total_budget;
        this.intervention_team_members = intervention_team_members;
        this.challenge_statement = challenge_statement;
        this.objective_statement = objective_statement;
        this.long_intervention_description = long_intervention_description;
        this.CGIAR_action_areas_name = CGIAR_action_areas_name;
        this.submitter_company_name = submitter_company_name;
        this.submitter_email = submitter_email;
        this.submitter_country = submitter_country;
        this.submitter_website = submitter_website;
        this.organizational_logo = organizational_logo;
        this.submitter_first_name = submitter_first_name;
        this.submitter_last_name = submitter_last_name;
        this.key_innovation_partners = key_innovation_partners;
        this.key_scaling_partners = key_scaling_partners;
        this.key_demand_partners = key_demand_partners;
        this.locations_of_implementation = locations_of_implementation;
        this.work_start_date = work_start_date;
        this.work_end_date = work_end_date;
        this.problem_to_be_solved = problem_to_be_solved;
        this.SDG_targets = SDG_targets;
        this.CGIAR_impact_targets = CGIAR_impact_targets;
        this.initiative_defined_outcome = initiative_defined_outcome;
        this.environmental_benefits = environmental_benefits;
        this.technology_dev_stage = technology_dev_stage;
        this.technology_dev_project_summary = technology_dev_project_summary;
        this.innovation_readiness_levels_of_component = innovation_readiness_levels_of_component;
        this.applied_evidence_locations = applied_evidence_locations;
        this.experimental_evidence_locations = experimental_evidence_locations;
        this.impact_evidence_locations = impact_evidence_locations;
        this.innovation_reference_materials = innovation_reference_materials;
        this.technology_appraisal = technology_appraisal;
        this.technology_appraisal_image = technology_appraisal_image;
        this.documentation = documentation;
        this.patent_member_type = patent_member_type;
        this.patent_number = patent_number;
        this.patent_office = patent_office;
        this.patent_know_how_info = patent_know_how_info;
        this.administrative_scale_of_innovations = administrative_scale_of_innovations;
        this.innovation_users = innovation_users;
        this.innovation_beneficiaries = innovation_beneficiaries;
        this.innovation_sponsors = innovation_sponsors;
        this.value_added = value_added;
        this.main_advantages = main_advantages;
        this.main_disadvantages = main_disadvantages;
        this.investment_sought = investment_sought;
        this.investment_sought_type = investment_sought_type;
        this.estimated_amount_sought = estimated_amount_sought;
        this.innovation_use_levels_of_components = innovation_use_levels_of_components;
        this.scaling_readiness_level = scaling_readiness_level;
        this.scaling_readiness_score = scaling_readiness_score;
        this.HDL = HDL;
        this.region = region;
        this.impact_areas = impact_areas;
        this.organizations = organizations;
        this.SDG = SDG;
        this.last_updated = last_updated;
        this.sdg_target_ui = sdg_target_ui;
        this.phrase_suggester = phrase_suggester;
        this.completion_suggester = completion_suggester;
        this.term_suggester = term_suggester;
        this.ngram_tokenizer = ngram_tokenizer;
    }

    public String getInnovation_uuid() {
        return innovation_uuid;
    }

    public void setInnovation_uuid(String innovation_uuid) {
        this.innovation_uuid = innovation_uuid;
    }

    public int getInnovation_image_id() {
        return innovation_image_id;
    }

    public void setInnovation_image_id(int innovation_image_id) {
        this.innovation_image_id = innovation_image_id;
    }

    public String getMel_user_id_who_reported_innovation() {
        return mel_user_id_who_reported_innovation;
    }

    public void setMel_user_id_who_reported_innovation(String mel_user_id_who_reported_innovation) {
        this.mel_user_id_who_reported_innovation = mel_user_id_who_reported_innovation;
    }

    public int getMel_id_single() {
        return mel_id_single;
    }

    public void setMel_id_single(int mel_id_single) {
        this.mel_id_single = mel_id_single;
    }

    public int getMel_version_id_single() {
        return mel_version_id_single;
    }

    public void setMel_version_id_single(int mel_version_id_single) {
        this.mel_version_id_single = mel_version_id_single;
    }

    public List<String> getMel_ids_of_related_innovations() {
        return mel_ids_of_related_innovations;
    }

    public void setMel_ids_of_related_innovations(List<String> mel_ids_of_related_innovations) {
        this.mel_ids_of_related_innovations = mel_ids_of_related_innovations;
    }

    public List<Integer> getUser_id() {
        return user_id;
    }

    public void setUser_id(List<Integer> user_id) {
        this.user_id = user_id;
    }

    public String getInnovation_common_name() {
        return innovation_common_name;
    }

    public void setInnovation_common_name(String innovation_common_name) {
        this.innovation_common_name = innovation_common_name;
    }

    public String getLong_innovation_description() {
        return long_innovation_description;
    }

    public void setLong_innovation_description(String long_innovation_description) {
        this.long_innovation_description = long_innovation_description;
    }

    public List<String> getBusiness_category() {
        return business_category;
    }

    public void setBusiness_category(List<String> business_category) {
        this.business_category = business_category;
    }

    public List<String> getRelated_keywords() {
        return related_keywords;
    }

    public void setRelated_keywords(List<String> related_keywords) {
        this.related_keywords = related_keywords;
    }

    public String getInnovation_url() {
        return innovation_url;
    }

    public void setInnovation_url(String innovation_url) {
        this.innovation_url = innovation_url;
    }

    public String getInnovation_image() {
        return innovation_image;
    }

    public void setInnovation_image(String innovation_image) {
        this.innovation_image = innovation_image;
    }

    public String getInnovation_image_component() {
        return innovation_image_component;
    }

    public void setInnovation_image_component(String innovation_image_component) {
        this.innovation_image_component = innovation_image_component;
    }

    public List<String> getTechnical_fields() {
        return technical_fields;
    }

    public void setTechnical_fields(List<String> technical_fields) {
        this.technical_fields = technical_fields;
    }

    public List<String> getInnovation_type_old() {
        return innovation_type_old;
    }

    public void setInnovation_type_old(List<String> innovation_type_old) {
        this.innovation_type_old = innovation_type_old;
    }

    public List<String> getInnovation_type_new() {
        return innovation_type_new;
    }

    public void setInnovation_type_new(List<String> innovation_type_new) {
        this.innovation_type_new = innovation_type_new;
    }

    public List<String> getGov_type_of_solution() {
        return gov_type_of_solution;
    }

    public void setGov_type_of_solution(List<String> gov_type_of_solution) {
        this.gov_type_of_solution = gov_type_of_solution;
    }

    public List<String> getIntervention_long_name() {
        return intervention_long_name;
    }

    public void setIntervention_long_name(List<String> intervention_long_name) {
        this.intervention_long_name = intervention_long_name;
    }

    public List<String> getIntervention_short_name() {
        return intervention_short_name;
    }

    public void setIntervention_short_name(List<String> intervention_short_name) {
        this.intervention_short_name = intervention_short_name;
    }

    public List<String> getIntervention_full_name() {
        return intervention_full_name;
    }

    public void setIntervention_full_name(List<String> intervention_full_name) {
        this.intervention_full_name = intervention_full_name;
    }

    public int getIntervention_total_budget() {
        return intervention_total_budget;
    }

    public void setIntervention_total_budget(int intervention_total_budget) {
        this.intervention_total_budget = intervention_total_budget;
    }

    public List<String> getIntervention_team_members() {
        return intervention_team_members;
    }

    public void setIntervention_team_members(List<String> intervention_team_members) {
        this.intervention_team_members = intervention_team_members;
    }

    public String getChallenge_statement() {
        return challenge_statement;
    }

    public void setChallenge_statement(String challenge_statement) {
        this.challenge_statement = challenge_statement;
    }

    public String getObjective_statement() {
        return objective_statement;
    }

    public void setObjective_statement(String objective_statement) {
        this.objective_statement = objective_statement;
    }

    public String getLong_intervention_description() {
        return long_intervention_description;
    }

    public void setLong_intervention_description(String long_intervention_description) {
        this.long_intervention_description = long_intervention_description;
    }

    public List<String> getCGIAR_action_areas_name() {
        return CGIAR_action_areas_name;
    }

    public void setCGIAR_action_areas_name(List<String> CGIAR_action_areas_name) {
        this.CGIAR_action_areas_name = CGIAR_action_areas_name;
    }

    public String getSubmitter_company_name() {
        return submitter_company_name;
    }

    public void setSubmitter_company_name(String submitter_company_name) {
        this.submitter_company_name = submitter_company_name;
    }

    public String getSubmitter_email() {
        return submitter_email;
    }

    public void setSubmitter_email(String submitter_email) {
        this.submitter_email = submitter_email;
    }

    public String getSubmitter_country() {
        return submitter_country;
    }

    public void setSubmitter_country(String submitter_country) {
        this.submitter_country = submitter_country;
    }

    public String getSubmitter_website() {
        return submitter_website;
    }

    public void setSubmitter_website(String submitter_website) {
        this.submitter_website = submitter_website;
    }

    public String getOrganizational_logo() {
        return organizational_logo;
    }

    public void setOrganizational_logo(String organizational_logo) {
        this.organizational_logo = organizational_logo;
    }

    public String getSubmitter_first_name() {
        return submitter_first_name;
    }

    public void setSubmitter_first_name(String submitter_first_name) {
        this.submitter_first_name = submitter_first_name;
    }

    public String getSubmitter_last_name() {
        return submitter_last_name;
    }

    public void setSubmitter_last_name(String submitter_last_name) {
        this.submitter_last_name = submitter_last_name;
    }

    public List<String> getKey_innovation_partners() {
        return key_innovation_partners;
    }

    public void setKey_innovation_partners(List<String> key_innovation_partners) {
        this.key_innovation_partners = key_innovation_partners;
    }

    public List<String> getKey_scaling_partners() {
        return key_scaling_partners;
    }

    public void setKey_scaling_partners(List<String> key_scaling_partners) {
        this.key_scaling_partners = key_scaling_partners;
    }

    public List<String> getKey_demand_partners() {
        return key_demand_partners;
    }

    public void setKey_demand_partners(List<String> key_demand_partners) {
        this.key_demand_partners = key_demand_partners;
    }

    public List<String> getLocations_of_implementation() {
        return locations_of_implementation;
    }

    public void setLocations_of_implementation(List<String> locations_of_implementation) {
        this.locations_of_implementation = locations_of_implementation;
    }

    public List<Integer> getWork_start_date() {
        return work_start_date;
    }

    public void setWork_start_date(List<Integer> work_start_date) {
        this.work_start_date = work_start_date;
    }

    public List<Integer> getWork_end_date() {
        return work_end_date;
    }

    public void setWork_end_date(List<Integer> work_end_date) {
        this.work_end_date = work_end_date;
    }

    public List<String> getProblem_to_be_solved() {
        return problem_to_be_solved;
    }

    public void setProblem_to_be_solved(List<String> problem_to_be_solved) {
        this.problem_to_be_solved = problem_to_be_solved;
    }

    public List<String> getSDG_targets() {
        return SDG_targets;
    }

    public void setSDG_targets(List<String> SDG_targets) {
        this.SDG_targets = SDG_targets;
    }

    public List<String> getCGIAR_impact_targets() {
        return CGIAR_impact_targets;
    }

    public void setCGIAR_impact_targets(List<String> CGIAR_impact_targets) {
        this.CGIAR_impact_targets = CGIAR_impact_targets;
    }

    public List<String> getInitiative_defined_outcome() {
        return initiative_defined_outcome;
    }

    public void setInitiative_defined_outcome(List<String> initiative_defined_outcome) {
        this.initiative_defined_outcome = initiative_defined_outcome;
    }

    public List<String> getEnvironmental_benefits() {
        return environmental_benefits;
    }

    public void setEnvironmental_benefits(List<String> environmental_benefits) {
        this.environmental_benefits = environmental_benefits;
    }

    public String getTechnology_dev_stage() {
        return technology_dev_stage;
    }

    public void setTechnology_dev_stage(String technology_dev_stage) {
        this.technology_dev_stage = technology_dev_stage;
    }

    public String getTechnology_dev_project_summary() {
        return technology_dev_project_summary;
    }

    public void setTechnology_dev_project_summary(String technology_dev_project_summary) {
        this.technology_dev_project_summary = technology_dev_project_summary;
    }

    public List<String> getInnovation_readiness_levels_of_component() {
        return innovation_readiness_levels_of_component;
    }

    public void setInnovation_readiness_levels_of_component(List<String> innovation_readiness_levels_of_component) {
        this.innovation_readiness_levels_of_component = innovation_readiness_levels_of_component;
    }

    public List<String> getApplied_evidence_locations() {
        return applied_evidence_locations;
    }

    public void setApplied_evidence_locations(List<String> applied_evidence_locations) {
        this.applied_evidence_locations = applied_evidence_locations;
    }

    public List<String> getExperimental_evidence_locations() {
        return experimental_evidence_locations;
    }

    public void setExperimental_evidence_locations(List<String> experimental_evidence_locations) {
        this.experimental_evidence_locations = experimental_evidence_locations;
    }

    public List<String> getImpact_evidence_locations() {
        return impact_evidence_locations;
    }

    public void setImpact_evidence_locations(List<String> impact_evidence_locations) {
        this.impact_evidence_locations = impact_evidence_locations;
    }

    public List<String> getInnovation_reference_materials() {
        return innovation_reference_materials;
    }

    public void setInnovation_reference_materials(List<String> innovation_reference_materials) {
        this.innovation_reference_materials = innovation_reference_materials;
    }

    public String getTechnology_appraisal() {
        return technology_appraisal;
    }

    public void setTechnology_appraisal(String technology_appraisal) {
        this.technology_appraisal = technology_appraisal;
    }

    public String getTechnology_appraisal_image() {
        return technology_appraisal_image;
    }

    public void setTechnology_appraisal_image(String technology_appraisal_image) {
        this.technology_appraisal_image = technology_appraisal_image;
    }

    public List<String> getDocumentation() {
        return documentation;
    }

    public void setDocumentation(List<String> documentation) {
        this.documentation = documentation;
    }

    public String getPatent_member_type() {
        return patent_member_type;
    }

    public void setPatent_member_type(String patent_member_type) {
        this.patent_member_type = patent_member_type;
    }

    public int getPatent_number() {
        return patent_number;
    }

    public void setPatent_number(int patent_number) {
        this.patent_number = patent_number;
    }

    public String getPatent_office() {
        return patent_office;
    }

    public void setPatent_office(String patent_office) {
        this.patent_office = patent_office;
    }

    public String getPatent_know_how_info() {
        return patent_know_how_info;
    }

    public void setPatent_know_how_info(String patent_know_how_info) {
        this.patent_know_how_info = patent_know_how_info;
    }

    public List<String> getAdministrative_scale_of_innovations() {
        return administrative_scale_of_innovations;
    }

    public void setAdministrative_scale_of_innovations(List<String> administrative_scale_of_innovations) {
        this.administrative_scale_of_innovations = administrative_scale_of_innovations;
    }

    public List<String> getInnovation_users() {
        return innovation_users;
    }

    public void setInnovation_users(List<String> innovation_users) {
        this.innovation_users = innovation_users;
    }

    public List<String> getInnovation_beneficiaries() {
        return innovation_beneficiaries;
    }

    public void setInnovation_beneficiaries(List<String> innovation_beneficiaries) {
        this.innovation_beneficiaries = innovation_beneficiaries;
    }

    public String getInnovation_sponsors() {
        return innovation_sponsors;
    }

    public void setInnovation_sponsors(String innovation_sponsors) {
        this.innovation_sponsors = innovation_sponsors;
    }

    public String getValue_added() {
        return value_added;
    }

    public void setValue_added(String value_added) {
        this.value_added = value_added;
    }

    public String getMain_advantages() {
        return main_advantages;
    }

    public void setMain_advantages(String main_advantages) {
        this.main_advantages = main_advantages;
    }

    public String getMain_disadvantages() {
        return main_disadvantages;
    }

    public void setMain_disadvantages(String main_disadvantages) {
        this.main_disadvantages = main_disadvantages;
    }

    public String getInvestment_sought() {
        return investment_sought;
    }

    public void setInvestment_sought(String investment_sought) {
        this.investment_sought = investment_sought;
    }

    public List<String> getInvestment_sought_type() {
        return investment_sought_type;
    }

    public void setInvestment_sought_type(List<String> investment_sought_type) {
        this.investment_sought_type = investment_sought_type;
    }

    public int getEstimated_amount_sought() {
        return estimated_amount_sought;
    }

    public void setEstimated_amount_sought(int estimated_amount_sought) {
        this.estimated_amount_sought = estimated_amount_sought;
    }

    public List<String> getInnovation_use_levels_of_components() {
        return innovation_use_levels_of_components;
    }

    public void setInnovation_use_levels_of_components(List<String> innovation_use_levels_of_components) {
        this.innovation_use_levels_of_components = innovation_use_levels_of_components;
    }

    public int getScaling_readiness_level() {
        return scaling_readiness_level;
    }

    public void setScaling_readiness_level(int scaling_readiness_level) {
        this.scaling_readiness_level = scaling_readiness_level;
    }

    public double getScaling_readiness_score() {
        return scaling_readiness_score;
    }

    public void setScaling_readiness_score(double scaling_readiness_score) {
        this.scaling_readiness_score = scaling_readiness_score;
    }

    public String getHDL() {
        return HDL;
    }

    public void setHDL(String HDL) {
        this.HDL = HDL;
    }

    public List<String> getRegion() {
        return region;
    }

    public void setRegion(List<String> region) {
        this.region = region;
    }

    public List<String> getImpact_areas() {
        return impact_areas;
    }

    public void setImpact_areas(List<String> impact_areas) {
        this.impact_areas = impact_areas;
    }

    public String getOrganizations() {
        return organizations;
    }

    public void setOrganizations(String organizations) {
        this.organizations = organizations;
    }

    public List<SDGName> getSDG() {
        return SDG;
    }

    public void setSDG(List<SDGName> SDG) {
        this.SDG = SDG;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }

    public List<SdgTargetUI> getSdg_target_ui() {
        return sdg_target_ui;
    }

    public void setSdg_target_ui(List<SdgTargetUI> sdg_target_ui) {
        this.sdg_target_ui = sdg_target_ui;
    }

    public String getPhrase_suggester() {
        return phrase_suggester;
    }

    public void setPhrase_suggester(String phrase_suggester) {
        this.phrase_suggester = phrase_suggester;
    }

    public String getCompletion_suggester() {
        return completion_suggester;
    }

    public void setCompletion_suggester(String completion_suggester) {
        this.completion_suggester = completion_suggester;
    }

    public String getTerm_suggester() {
        return term_suggester;
    }

    public void setTerm_suggester(String term_suggester) {
        this.term_suggester = term_suggester;
    }

    public String getNgram_tokenizer() {
        return ngram_tokenizer;
    }

    public void setNgram_tokenizer(String ngram_tokenizer) {
        this.ngram_tokenizer = ngram_tokenizer;
    }
}
