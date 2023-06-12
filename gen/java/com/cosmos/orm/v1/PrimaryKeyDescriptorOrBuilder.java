// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/orm/v1/orm.proto

package com.cosmos.orm.v1;

public interface PrimaryKeyDescriptorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.orm.v1.PrimaryKeyDescriptor)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * fields is a comma-separated list of fields in the primary key. Spaces are
   * not allowed. Supported field types, their encodings, and any applicable constraints
   * are described below.
   *   - uint32 are encoded as 2,3,4 or 5 bytes using a compact encoding that
   *     is suitable for sorted iteration (not varint encoding). This type is
   *     well-suited for small integers.
   *   - uint64 are encoded as 2,4,6 or 9 bytes using a compact encoding that
   *     is suitable for sorted iteration (not varint encoding). This type is
   *     well-suited for small integers such as auto-incrementing sequences.
   *   - fixed32, fixed64 are encoded as big-endian fixed width bytes and support
   *   sorted iteration. These types are well-suited for encoding fixed with
   *   decimals as integers.
   *   - string's are encoded as raw bytes in terminal key segments and null-terminated
   *   in non-terminal segments. Null characters are thus forbidden in strings.
   *   string fields support sorted iteration.
   *   - bytes are encoded as raw bytes in terminal segments and length-prefixed
   *   with a 32-bit unsigned varint in non-terminal segments.
   *   - int32, sint32, int64, sint64, sfixed32, sfixed64 are encoded as fixed width bytes with
   *   an encoding that enables sorted iteration.
   *   - google.protobuf.Timestamp is encoded such that values with only seconds occupy 6 bytes,
   *   values including nanos occupy 9 bytes, and nil values occupy 1 byte. When iterating, nil
   *   values will always be ordered last. Seconds and nanos values must conform to the officially
   *   specified ranges of 0001-01-01T00:00:00Z to 9999-12-31T23:59:59Z and 0 to 999,999,999 respectively.
   *   - google.protobuf.Duration is encoded as 12 bytes using an encoding that enables sorted iteration.
   *   - enum fields are encoded using varint encoding and do not support sorted
   *   iteration.
   *   - bool fields are encoded as a single byte 0 or 1.
   *
   * All other fields types are unsupported in keys including repeated and
   * oneof fields.
   *
   * Primary keys are prefixed by the varint encoded table id and the byte 0x0
   * plus any additional prefix specified by the schema.
   * </pre>
   *
   * <code>string fields = 1 [json_name = "fields"];</code>
   * @return The fields.
   */
  java.lang.String getFields();
  /**
   * <pre>
   * fields is a comma-separated list of fields in the primary key. Spaces are
   * not allowed. Supported field types, their encodings, and any applicable constraints
   * are described below.
   *   - uint32 are encoded as 2,3,4 or 5 bytes using a compact encoding that
   *     is suitable for sorted iteration (not varint encoding). This type is
   *     well-suited for small integers.
   *   - uint64 are encoded as 2,4,6 or 9 bytes using a compact encoding that
   *     is suitable for sorted iteration (not varint encoding). This type is
   *     well-suited for small integers such as auto-incrementing sequences.
   *   - fixed32, fixed64 are encoded as big-endian fixed width bytes and support
   *   sorted iteration. These types are well-suited for encoding fixed with
   *   decimals as integers.
   *   - string's are encoded as raw bytes in terminal key segments and null-terminated
   *   in non-terminal segments. Null characters are thus forbidden in strings.
   *   string fields support sorted iteration.
   *   - bytes are encoded as raw bytes in terminal segments and length-prefixed
   *   with a 32-bit unsigned varint in non-terminal segments.
   *   - int32, sint32, int64, sint64, sfixed32, sfixed64 are encoded as fixed width bytes with
   *   an encoding that enables sorted iteration.
   *   - google.protobuf.Timestamp is encoded such that values with only seconds occupy 6 bytes,
   *   values including nanos occupy 9 bytes, and nil values occupy 1 byte. When iterating, nil
   *   values will always be ordered last. Seconds and nanos values must conform to the officially
   *   specified ranges of 0001-01-01T00:00:00Z to 9999-12-31T23:59:59Z and 0 to 999,999,999 respectively.
   *   - google.protobuf.Duration is encoded as 12 bytes using an encoding that enables sorted iteration.
   *   - enum fields are encoded using varint encoding and do not support sorted
   *   iteration.
   *   - bool fields are encoded as a single byte 0 or 1.
   *
   * All other fields types are unsupported in keys including repeated and
   * oneof fields.
   *
   * Primary keys are prefixed by the varint encoded table id and the byte 0x0
   * plus any additional prefix specified by the schema.
   * </pre>
   *
   * <code>string fields = 1 [json_name = "fields"];</code>
   * @return The bytes for fields.
   */
  com.google.protobuf.ByteString
      getFieldsBytes();

  /**
   * <pre>
   * auto_increment specifies that the primary key is generated by an
   * auto-incrementing integer. If this is set to true fields must only
   * contain one field of that is of type uint64.
   * </pre>
   *
   * <code>bool auto_increment = 2 [json_name = "autoIncrement"];</code>
   * @return The autoIncrement.
   */
  boolean getAutoIncrement();
}
