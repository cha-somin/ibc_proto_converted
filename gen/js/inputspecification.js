// source: provenance/metadata/v1/specification.proto
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

goog.provide('proto.provenance.metadata.v1.InputSpecification');
goog.provide('proto.provenance.metadata.v1.InputSpecification.SourceCase');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

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
proto.provenance.metadata.v1.InputSpecification = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, proto.provenance.metadata.v1.InputSpecification.oneofGroups_);
};
goog.inherits(proto.provenance.metadata.v1.InputSpecification, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.provenance.metadata.v1.InputSpecification.displayName = 'proto.provenance.metadata.v1.InputSpecification';
}

/**
 * Oneof group definitions for this message. Each group defines the field
 * numbers belonging to that group. When of these fields' value is set, all
 * other fields in the group are cleared. During deserialization, if multiple
 * fields are encountered for a group, only the last value seen will be kept.
 * @private {!Array<!Array<number>>}
 * @const
 */
proto.provenance.metadata.v1.InputSpecification.oneofGroups_ = [[3,4]];

/**
 * @enum {number}
 */
proto.provenance.metadata.v1.InputSpecification.SourceCase = {
  SOURCE_NOT_SET: 0,
  RECORD_ID: 3,
  HASH: 4
};

/**
 * @return {proto.provenance.metadata.v1.InputSpecification.SourceCase}
 */
proto.provenance.metadata.v1.InputSpecification.prototype.getSourceCase = function() {
  return /** @type {proto.provenance.metadata.v1.InputSpecification.SourceCase} */(jspb.Message.computeOneofCase(this, proto.provenance.metadata.v1.InputSpecification.oneofGroups_[0]));
};



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
proto.provenance.metadata.v1.InputSpecification.prototype.toObject = function(opt_includeInstance) {
  return proto.provenance.metadata.v1.InputSpecification.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.provenance.metadata.v1.InputSpecification} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.InputSpecification.toObject = function(includeInstance, msg) {
  var f, obj = {
    name: jspb.Message.getFieldWithDefault(msg, 1, ""),
    typeName: jspb.Message.getFieldWithDefault(msg, 2, ""),
    recordId: msg.getRecordId_asB64(),
    hash: jspb.Message.getFieldWithDefault(msg, 4, "")
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
 * @return {!proto.provenance.metadata.v1.InputSpecification}
 */
proto.provenance.metadata.v1.InputSpecification.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.provenance.metadata.v1.InputSpecification;
  return proto.provenance.metadata.v1.InputSpecification.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.provenance.metadata.v1.InputSpecification} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.provenance.metadata.v1.InputSpecification}
 */
proto.provenance.metadata.v1.InputSpecification.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setName(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setTypeName(value);
      break;
    case 3:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setRecordId(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setHash(value);
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
proto.provenance.metadata.v1.InputSpecification.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.provenance.metadata.v1.InputSpecification.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.provenance.metadata.v1.InputSpecification} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.InputSpecification.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getName();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getTypeName();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = /** @type {!(string|Uint8Array)} */ (jspb.Message.getField(message, 3));
  if (f != null) {
    writer.writeBytes(
      3,
      f
    );
  }
  f = /** @type {string} */ (jspb.Message.getField(message, 4));
  if (f != null) {
    writer.writeString(
      4,
      f
    );
  }
};


/**
 * optional string name = 1;
 * @return {string}
 */
proto.provenance.metadata.v1.InputSpecification.prototype.getName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.metadata.v1.InputSpecification} returns this
 */
proto.provenance.metadata.v1.InputSpecification.prototype.setName = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string type_name = 2;
 * @return {string}
 */
proto.provenance.metadata.v1.InputSpecification.prototype.getTypeName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.metadata.v1.InputSpecification} returns this
 */
proto.provenance.metadata.v1.InputSpecification.prototype.setTypeName = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional bytes record_id = 3;
 * @return {string}
 */
proto.provenance.metadata.v1.InputSpecification.prototype.getRecordId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * optional bytes record_id = 3;
 * This is a type-conversion wrapper around `getRecordId()`
 * @return {string}
 */
proto.provenance.metadata.v1.InputSpecification.prototype.getRecordId_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getRecordId()));
};


/**
 * optional bytes record_id = 3;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getRecordId()`
 * @return {!Uint8Array}
 */
proto.provenance.metadata.v1.InputSpecification.prototype.getRecordId_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getRecordId()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.provenance.metadata.v1.InputSpecification} returns this
 */
proto.provenance.metadata.v1.InputSpecification.prototype.setRecordId = function(value) {
  return jspb.Message.setOneofField(this, 3, proto.provenance.metadata.v1.InputSpecification.oneofGroups_[0], value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.provenance.metadata.v1.InputSpecification} returns this
 */
proto.provenance.metadata.v1.InputSpecification.prototype.clearRecordId = function() {
  return jspb.Message.setOneofField(this, 3, proto.provenance.metadata.v1.InputSpecification.oneofGroups_[0], undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.provenance.metadata.v1.InputSpecification.prototype.hasRecordId = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional string hash = 4;
 * @return {string}
 */
proto.provenance.metadata.v1.InputSpecification.prototype.getHash = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.metadata.v1.InputSpecification} returns this
 */
proto.provenance.metadata.v1.InputSpecification.prototype.setHash = function(value) {
  return jspb.Message.setOneofField(this, 4, proto.provenance.metadata.v1.InputSpecification.oneofGroups_[0], value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.provenance.metadata.v1.InputSpecification} returns this
 */
proto.provenance.metadata.v1.InputSpecification.prototype.clearHash = function() {
  return jspb.Message.setOneofField(this, 4, proto.provenance.metadata.v1.InputSpecification.oneofGroups_[0], undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.provenance.metadata.v1.InputSpecification.prototype.hasHash = function() {
  return jspb.Message.getField(this, 4) != null;
};


