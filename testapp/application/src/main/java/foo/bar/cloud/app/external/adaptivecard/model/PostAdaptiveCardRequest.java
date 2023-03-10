

/*
 * ZOA Adaptive Card
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

 package foo.bar.cloud.app.external.adaptivecard.model;

 import java.util.Objects;
 import java.util.Arrays;
 import com.fasterxml.jackson.annotation.JsonInclude;
 import com.fasterxml.jackson.annotation.JsonProperty;
 import com.fasterxml.jackson.annotation.JsonCreator;
 import com.fasterxml.jackson.annotation.JsonTypeName;
 import com.fasterxml.jackson.annotation.JsonValue;
 import java.io.Serializable;
 import com.fasterxml.jackson.annotation.JsonPropertyOrder;
 import com.fasterxml.jackson.annotation.JsonTypeName;
 import com.google.gson.annotations.SerializedName;
 
 import javax.annotation.Nonnull;
 import javax.annotation.Nullable;
 
 /**
  * PostAdaptiveCardRequest
  */
 @javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
 
 // CHECKSTYLE:OFF
 public class PostAdaptiveCardRequest 
 // CHECKSTYLE:ON
 {
   @JsonProperty("req_num")
   @SerializedName("req_num")
   private String reqNum;
 
   @JsonProperty("action_code")
   @SerializedName("action_code")
   private String actionCode;
 
   @JsonProperty("submitter_userid")
   @SerializedName("submitter_userid")
   private String submitterUserid;
 
   @JsonProperty("approver_userid")
   @SerializedName("approver_userid")
   private String approverUserid;
 
   @JsonProperty("approver_level")
   @SerializedName("approver_level")
   private String approverLevel;
 
   @JsonProperty("comments")
   @SerializedName("comments")
   private String comments;
 
 
    /**
    * Set the reqNum of this {@link PostAdaptiveCardRequest} instance and return the same instance.
    *
    * @param reqNum  The reqNum of this {@link PostAdaptiveCardRequest}
    * @return The same instance of this {@link PostAdaptiveCardRequest} class
    */
    @Nonnull public PostAdaptiveCardRequest reqNum(@Nonnull final String reqNum) {
     this.reqNum = reqNum;
     return this;
   }
 
    /**
    * Get reqNum
    * @return reqNum  The reqNum of this {@link PostAdaptiveCardRequest} instance.
   **/
   @Nonnull public String getReqNum() {
     return reqNum;
   }
 
   /**
   * Set the reqNum of this {@link PostAdaptiveCardRequest} instance.
   *
   * @param reqNum  The reqNum of this {@link PostAdaptiveCardRequest}
   */
   public void setReqNum( @Nonnull final String reqNum) {
     this.reqNum = reqNum;
   }
 
    /**
    * Set the actionCode of this {@link PostAdaptiveCardRequest} instance and return the same instance.
    *
    * @param actionCode  The actionCode of this {@link PostAdaptiveCardRequest}
    * @return The same instance of this {@link PostAdaptiveCardRequest} class
    */
    @Nonnull public PostAdaptiveCardRequest actionCode(@Nonnull final String actionCode) {
     this.actionCode = actionCode;
     return this;
   }
 
    /**
    * Get actionCode
    * @return actionCode  The actionCode of this {@link PostAdaptiveCardRequest} instance.
   **/
   @Nonnull public String getActionCode() {
     return actionCode;
   }
 
   /**
   * Set the actionCode of this {@link PostAdaptiveCardRequest} instance.
   *
   * @param actionCode  The actionCode of this {@link PostAdaptiveCardRequest}
   */
   public void setActionCode( @Nonnull final String actionCode) {
     this.actionCode = actionCode;
   }
 
    /**
    * Set the submitterUserid of this {@link PostAdaptiveCardRequest} instance and return the same instance.
    *
    * @param submitterUserid  The submitterUserid of this {@link PostAdaptiveCardRequest}
    * @return The same instance of this {@link PostAdaptiveCardRequest} class
    */
    @Nonnull public PostAdaptiveCardRequest submitterUserid(@Nonnull final String submitterUserid) {
     this.submitterUserid = submitterUserid;
     return this;
   }
 
    /**
    * Get submitterUserid
    * @return submitterUserid  The submitterUserid of this {@link PostAdaptiveCardRequest} instance.
   **/
   @Nonnull public String getSubmitterUserid() {
     return submitterUserid;
   }
 
   /**
   * Set the submitterUserid of this {@link PostAdaptiveCardRequest} instance.
   *
   * @param submitterUserid  The submitterUserid of this {@link PostAdaptiveCardRequest}
   */
   public void setSubmitterUserid( @Nonnull final String submitterUserid) {
     this.submitterUserid = submitterUserid;
   }
 
    /**
    * Set the approverUserid of this {@link PostAdaptiveCardRequest} instance and return the same instance.
    *
    * @param approverUserid  The approverUserid of this {@link PostAdaptiveCardRequest}
    * @return The same instance of this {@link PostAdaptiveCardRequest} class
    */
    @Nonnull public PostAdaptiveCardRequest approverUserid(@Nonnull final String approverUserid) {
     this.approverUserid = approverUserid;
     return this;
   }
 
    /**
    * Get approverUserid
    * @return approverUserid  The approverUserid of this {@link PostAdaptiveCardRequest} instance.
   **/
   @Nonnull public String getApproverUserid() {
     return approverUserid;
   }
 
   /**
   * Set the approverUserid of this {@link PostAdaptiveCardRequest} instance.
   *
   * @param approverUserid  The approverUserid of this {@link PostAdaptiveCardRequest}
   */
   public void setApproverUserid( @Nonnull final String approverUserid) {
     this.approverUserid = approverUserid;
   }
 
    /**
    * Set the approverLevel of this {@link PostAdaptiveCardRequest} instance and return the same instance.
    *
    * @param approverLevel  The approverLevel of this {@link PostAdaptiveCardRequest}
    * @return The same instance of this {@link PostAdaptiveCardRequest} class
    */
    @Nonnull public PostAdaptiveCardRequest approverLevel(@Nonnull final String approverLevel) {
     this.approverLevel = approverLevel;
     return this;
   }
 
    /**
    * Get approverLevel
    * @return approverLevel  The approverLevel of this {@link PostAdaptiveCardRequest} instance.
   **/
   @Nonnull public String getApproverLevel() {
     return approverLevel;
   }
 
   /**
   * Set the approverLevel of this {@link PostAdaptiveCardRequest} instance.
   *
   * @param approverLevel  The approverLevel of this {@link PostAdaptiveCardRequest}
   */
   public void setApproverLevel( @Nonnull final String approverLevel) {
     this.approverLevel = approverLevel;
   }
 
    /**
    * Set the comments of this {@link PostAdaptiveCardRequest} instance and return the same instance.
    *
    * @param comments  The comments of this {@link PostAdaptiveCardRequest}
    * @return The same instance of this {@link PostAdaptiveCardRequest} class
    */
    @Nonnull public PostAdaptiveCardRequest comments(@Nonnull final String comments) {
     this.comments = comments;
     return this;
   }
 
    /**
    * Get comments
    * @return comments  The comments of this {@link PostAdaptiveCardRequest} instance.
   **/
   @Nonnull public String getComments() {
     return comments;
   }
 
   /**
   * Set the comments of this {@link PostAdaptiveCardRequest} instance.
   *
   * @param comments  The comments of this {@link PostAdaptiveCardRequest}
   */
   public void setComments( @Nonnull final String comments) {
     this.comments = comments;
   }
   @Override
   public boolean equals(@Nullable final java.lang.Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     final PostAdaptiveCardRequest postAdaptiveCardRequest = (PostAdaptiveCardRequest) o;
     return Objects.equals(this.reqNum, postAdaptiveCardRequest.reqNum) &&
         Objects.equals(this.actionCode, postAdaptiveCardRequest.actionCode) &&
         Objects.equals(this.submitterUserid, postAdaptiveCardRequest.submitterUserid) &&
         Objects.equals(this.approverUserid, postAdaptiveCardRequest.approverUserid) &&
         Objects.equals(this.approverLevel, postAdaptiveCardRequest.approverLevel) &&
         Objects.equals(this.comments, postAdaptiveCardRequest.comments);
   }
 
   @Override
   public int hashCode() {
     return Objects.hash(reqNum, actionCode, submitterUserid, approverUserid, approverLevel, comments);
   }
 
   @Override
   @Nonnull public String toString() {
     final StringBuilder sb = new StringBuilder();
     sb.append("class PostAdaptiveCardRequest {\n");
     sb.append("    reqNum: ").append(toIndentedString(reqNum)).append("\n");
     sb.append("    actionCode: ").append(toIndentedString(actionCode)).append("\n");
     sb.append("    submitterUserid: ").append(toIndentedString(submitterUserid)).append("\n");
     sb.append("    approverUserid: ").append(toIndentedString(approverUserid)).append("\n");
     sb.append("    approverLevel: ").append(toIndentedString(approverLevel)).append("\n");
     sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
     sb.append("}");
     return sb.toString();
   }
 
   /**
    * Convert the given object to string with each line indented by 4 spaces
    * (except the first line).
    */
   private String toIndentedString(final java.lang.Object o) {
     if (o == null) {
       return "null";
     }
     return o.toString().replace("\n", "\n    ");
   }
 
 }