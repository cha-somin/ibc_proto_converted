// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/profiles/v2/models_profile.proto

package com.desmos.profiles.v2;

public interface ProfileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:desmos.profiles.v2.Profile)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Account represents the base Cosmos account associated with this profile
   * </pre>
   *
   * <code>.google.protobuf.Any account = 1 [json_name = "account", (.cosmos_proto.accepts_interface) = "cosmos.auth.v1beta1.AccountI"];</code>
   * @return Whether the account field is set.
   */
  boolean hasAccount();
  /**
   * <pre>
   * Account represents the base Cosmos account associated with this profile
   * </pre>
   *
   * <code>.google.protobuf.Any account = 1 [json_name = "account", (.cosmos_proto.accepts_interface) = "cosmos.auth.v1beta1.AccountI"];</code>
   * @return The account.
   */
  com.google.protobuf.Any getAccount();
  /**
   * <pre>
   * Account represents the base Cosmos account associated with this profile
   * </pre>
   *
   * <code>.google.protobuf.Any account = 1 [json_name = "account", (.cosmos_proto.accepts_interface) = "cosmos.auth.v1beta1.AccountI"];</code>
   */
  com.google.protobuf.AnyOrBuilder getAccountOrBuilder();

  /**
   * <pre>
   * DTag represents the unique tag of this profile
   * </pre>
   *
   * <code>string dtag = 2 [json_name = "dtag", (.gogoproto.customname) = "DTag", (.gogoproto.moretags) = "yaml:&#92;"dtag&#92;""];</code>
   * @return The dtag.
   */
  java.lang.String getDtag();
  /**
   * <pre>
   * DTag represents the unique tag of this profile
   * </pre>
   *
   * <code>string dtag = 2 [json_name = "dtag", (.gogoproto.customname) = "DTag", (.gogoproto.moretags) = "yaml:&#92;"dtag&#92;""];</code>
   * @return The bytes for dtag.
   */
  com.google.protobuf.ByteString
      getDtagBytes();

  /**
   * <pre>
   * Nickname contains the custom human readable name of the profile
   * </pre>
   *
   * <code>string nickname = 3 [json_name = "nickname", (.gogoproto.moretags) = "yaml:&#92;"nickname&#92;""];</code>
   * @return The nickname.
   */
  java.lang.String getNickname();
  /**
   * <pre>
   * Nickname contains the custom human readable name of the profile
   * </pre>
   *
   * <code>string nickname = 3 [json_name = "nickname", (.gogoproto.moretags) = "yaml:&#92;"nickname&#92;""];</code>
   * @return The bytes for nickname.
   */
  com.google.protobuf.ByteString
      getNicknameBytes();

  /**
   * <pre>
   * Bio contains the biography of the profile
   * </pre>
   *
   * <code>string bio = 4 [json_name = "bio", (.gogoproto.moretags) = "yaml:&#92;"bio&#92;""];</code>
   * @return The bio.
   */
  java.lang.String getBio();
  /**
   * <pre>
   * Bio contains the biography of the profile
   * </pre>
   *
   * <code>string bio = 4 [json_name = "bio", (.gogoproto.moretags) = "yaml:&#92;"bio&#92;""];</code>
   * @return The bytes for bio.
   */
  com.google.protobuf.ByteString
      getBioBytes();

  /**
   * <pre>
   * Pictures contains the data about the pictures associated with he profile
   * </pre>
   *
   * <code>.desmos.profiles.v2.Pictures pictures = 5 [json_name = "pictures", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pictures&#92;""];</code>
   * @return Whether the pictures field is set.
   */
  boolean hasPictures();
  /**
   * <pre>
   * Pictures contains the data about the pictures associated with he profile
   * </pre>
   *
   * <code>.desmos.profiles.v2.Pictures pictures = 5 [json_name = "pictures", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pictures&#92;""];</code>
   * @return The pictures.
   */
  com.desmos.profiles.v2.Pictures getPictures();
  /**
   * <pre>
   * Pictures contains the data about the pictures associated with he profile
   * </pre>
   *
   * <code>.desmos.profiles.v2.Pictures pictures = 5 [json_name = "pictures", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pictures&#92;""];</code>
   */
  com.desmos.profiles.v2.PicturesOrBuilder getPicturesOrBuilder();

  /**
   * <pre>
   * CreationTime represents the time in which the profile has been created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp creation_date = 6 [json_name = "creationDate", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"creation_date&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return Whether the creationDate field is set.
   */
  boolean hasCreationDate();
  /**
   * <pre>
   * CreationTime represents the time in which the profile has been created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp creation_date = 6 [json_name = "creationDate", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"creation_date&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return The creationDate.
   */
  com.google.protobuf.Timestamp getCreationDate();
  /**
   * <pre>
   * CreationTime represents the time in which the profile has been created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp creation_date = 6 [json_name = "creationDate", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"creation_date&#92;"", (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreationDateOrBuilder();
}
