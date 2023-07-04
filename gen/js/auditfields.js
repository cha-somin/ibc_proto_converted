// source: provenance/metadata/v1/scope.proto
/**
 * @fileoverview
 * @enhanceable
 * @suppress {missingRequire} reports error on implicit type usages.
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!
/* eslint-disable */
// @ts-nocheck

goog.provide('proto.provenance.metadata.v1.AuditFields');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Timestamp');

/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.provenance.metadata.v1.AuditFields = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.provenance.metadata.v1.AuditFields, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.provenance.metadata.v1.AuditFields.displayName = 'proto.provenance.metadata.v1.AuditFields';
}



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.provenance.metadata.v1.AuditFields.prototype.toObject = function(opt_includeInstance) {
  return proto.provenance.metadata.v1.AuditFields.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.provenance.metadata.v1.AuditFields} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.AuditFields.toObject = function(includeInstance, msg) {
  var f, obj = {
    createdDate: (f = msg.getCreatedDate()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    createdBy: jspb.Message.getFieldWithDefault(msg, 2, ""),
    updatedDate: (f = msg.getUpdatedDate()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    updatedBy: jspb.Message.getFieldWithDefault(msg, 4, ""),
    version: jspb.Message.getFieldWithDefault(msg, 5, 0),
    message: jspb.Message.getFieldWithDefault(msg, 6, "")
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.provenance.metadata.v1.AuditFields}
 */
proto.provenance.metadata.v1.AuditFields.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.provenance.metadata.v1.AuditFields;
  return proto.provenance.metadata.v1.AuditFields.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.provenance.metadata.v1.AuditFields} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.provenance.metadata.v1.AuditFields}
 */
proto.provenance.metadata.v1.AuditFields.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setCreatedDate(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setCreatedBy(value);
      break;
    case 3:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setUpdatedDate(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setUpdatedBy(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setVersion(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setMessage(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.provenance.metadata.v1.AuditFields.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.provenance.metadata.v1.AuditFields.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.provenance.metadata.v1.AuditFields} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.AuditFields.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getCreatedDate();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getCreatedBy();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getUpdatedDate();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getUpdatedBy();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getVersion();
  if (f !== 0) {
    writer.writeUint32(
      5,
      f
    );
  }
  f = message.getMessage();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
};


/**
 * optional google.protobuf.Timestamp created_date = 1;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.provenance.metadata.v1.AuditFields.prototype.getCreatedDate = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 1));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.provenance.metadata.v1.AuditFields} returns this
*/
proto.provenance.metadata.v1.AuditFields.prototype.setCreatedDate = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.provenance.metadata.v1.AuditFields} returns this
 */
proto.provenance.metadata.v1.AuditFields.prototype.clearCreatedDate = function() {
  return this.setCreatedDate(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.provenance.metadata.v1.AuditFields.prototype.hasCreatedDate = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional string created_by = 2;
 * @return {string}
 */
proto.provenance.metadata.v1.AuditFields.prototype.getCreatedBy = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.metadata.v1.AuditFields} returns this
 */
proto.provenance.metadata.v1.AuditFields.prototype.setCreatedBy = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional google.protobuf.Timestamp updated_date = 3;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.provenance.metadata.v1.AuditFields.prototype.getUpdatedDate = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 3));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.provenance.metadata.v1.AuditFields} returns this
*/
proto.provenance.metadata.v1.AuditFields.prototype.setUpdatedDate = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.provenance.metadata.v1.AuditFields} returns this
 */
proto.provenance.metadata.v1.AuditFields.prototype.clearUpdatedDate = function() {
  return this.setUpdatedDate(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.provenance.metadata.v1.AuditFields.prototype.hasUpdatedDate = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional string updated_by = 4;
 * @return {string}
 */
proto.provenance.metadata.v1.AuditFields.prototype.getUpdatedBy = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.metadata.v1.AuditFields} returns this
 */
proto.provenance.metadata.v1.AuditFields.prototype.setUpdatedBy = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional uint32 version = 5;
 * @return {number}
 */
proto.provenance.metadata.v1.AuditFields.prototype.getVersion = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.provenance.metadata.v1.AuditFields} returns this
 */
proto.provenance.metadata.v1.AuditFields.prototype.setVersion = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


/**
 * optional string message = 6;
 * @return {string}
 */
proto.provenance.metadata.v1.AuditFields.prototype.getMessage = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.metadata.v1.AuditFields} returns this
 */
proto.provenance.metadata.v1.AuditFields.prototype.setMessage = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};

