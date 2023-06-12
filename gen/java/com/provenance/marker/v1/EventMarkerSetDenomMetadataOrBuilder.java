// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/marker/v1/marker.proto

package com.provenance.marker.v1;

public interface EventMarkerSetDenomMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:provenance.marker.v1.EventMarkerSetDenomMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string metadata_base = 1 [json_name = "metadataBase"];</code>
   * @return The metadataBase.
   */
  java.lang.String getMetadataBase();
  /**
   * <code>string metadata_base = 1 [json_name = "metadataBase"];</code>
   * @return The bytes for metadataBase.
   */
  com.google.protobuf.ByteString
      getMetadataBaseBytes();

  /**
   * <code>string metadata_description = 2 [json_name = "metadataDescription"];</code>
   * @return The metadataDescription.
   */
  java.lang.String getMetadataDescription();
  /**
   * <code>string metadata_description = 2 [json_name = "metadataDescription"];</code>
   * @return The bytes for metadataDescription.
   */
  com.google.protobuf.ByteString
      getMetadataDescriptionBytes();

  /**
   * <code>string metadata_display = 3 [json_name = "metadataDisplay"];</code>
   * @return The metadataDisplay.
   */
  java.lang.String getMetadataDisplay();
  /**
   * <code>string metadata_display = 3 [json_name = "metadataDisplay"];</code>
   * @return The bytes for metadataDisplay.
   */
  com.google.protobuf.ByteString
      getMetadataDisplayBytes();

  /**
   * <code>repeated .provenance.marker.v1.EventDenomUnit metadata_denom_units = 4 [json_name = "metadataDenomUnits"];</code>
   */
  java.util.List<com.provenance.marker.v1.EventDenomUnit> 
      getMetadataDenomUnitsList();
  /**
   * <code>repeated .provenance.marker.v1.EventDenomUnit metadata_denom_units = 4 [json_name = "metadataDenomUnits"];</code>
   */
  com.provenance.marker.v1.EventDenomUnit getMetadataDenomUnits(int index);
  /**
   * <code>repeated .provenance.marker.v1.EventDenomUnit metadata_denom_units = 4 [json_name = "metadataDenomUnits"];</code>
   */
  int getMetadataDenomUnitsCount();
  /**
   * <code>repeated .provenance.marker.v1.EventDenomUnit metadata_denom_units = 4 [json_name = "metadataDenomUnits"];</code>
   */
  java.util.List<? extends com.provenance.marker.v1.EventDenomUnitOrBuilder> 
      getMetadataDenomUnitsOrBuilderList();
  /**
   * <code>repeated .provenance.marker.v1.EventDenomUnit metadata_denom_units = 4 [json_name = "metadataDenomUnits"];</code>
   */
  com.provenance.marker.v1.EventDenomUnitOrBuilder getMetadataDenomUnitsOrBuilder(
      int index);

  /**
   * <code>string administrator = 5 [json_name = "administrator"];</code>
   * @return The administrator.
   */
  java.lang.String getAdministrator();
  /**
   * <code>string administrator = 5 [json_name = "administrator"];</code>
   * @return The bytes for administrator.
   */
  com.google.protobuf.ByteString
      getAdministratorBytes();

  /**
   * <code>string metadata_name = 6 [json_name = "metadataName"];</code>
   * @return The metadataName.
   */
  java.lang.String getMetadataName();
  /**
   * <code>string metadata_name = 6 [json_name = "metadataName"];</code>
   * @return The bytes for metadataName.
   */
  com.google.protobuf.ByteString
      getMetadataNameBytes();

  /**
   * <code>string metadata_symbol = 7 [json_name = "metadataSymbol"];</code>
   * @return The metadataSymbol.
   */
  java.lang.String getMetadataSymbol();
  /**
   * <code>string metadata_symbol = 7 [json_name = "metadataSymbol"];</code>
   * @return The bytes for metadataSymbol.
   */
  com.google.protobuf.ByteString
      getMetadataSymbolBytes();
}
