// source: provenance/metadata/v1/metadata.proto
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

goog.provide('proto.provenance.metadata.v1.ScopeSpecIdInfo');

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
proto.provenance.metadata.v1.ScopeSpecIdInfo = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.provenance.metadata.v1.ScopeSpecIdInfo, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.provenance.metadata.v1.ScopeSpecIdInfo.displayName = 'proto.provenance.metadata.v1.ScopeSpecIdInfo';
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
proto.provenance.metadata.v1.ScopeSpecIdInfo.prototype.toObject = function(opt_includeInstance) {
  return proto.provenance.metadata.v1.ScopeSpecIdInfo.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.provenance.metadata.v1.ScopeSpecIdInfo} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.ScopeSpecIdInfo.toObject = function(includeInstance, msg) {
  var f, obj = {
    scopeSpecId: msg.getScopeSpecId_asB64(),
    scopeSpecIdPrefix: msg.getScopeSpecIdPrefix_asB64(),
    scopeSpecIdScopeSpecUuid: msg.getScopeSpecIdScopeSpecUuid_asB64(),
    scopeSpecAddr: jspb.Message.getFieldWithDefault(msg, 4, ""),
    scopeSpecUuid: jspb.Message.getFieldWithDefault(msg, 5, "")
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
 * @return {!proto.provenance.metadata.v1.ScopeSpecIdInfo}
 */
proto.provenance.metadata.v1.ScopeSpecIdInfo.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.provenance.metadata.v1.ScopeSpecIdInfo;
  return proto.provenance.metadata.v1.ScopeSpecIdInfo.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.provenance.metadata.v1.ScopeSpecIdInfo} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.provenance.metadata.v1.ScopeSpecIdInfo}
 */
proto.provenance.metadata.v1.ScopeSpecIdInfo.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setScopeSpecId(value);
      break;
    case 2:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setScopeSpecIdPrefix(value);
      break;
    case 3:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setScopeSpecIdScopeSpecUuid(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setScopeSpecAddr(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setScopeSpecUuid(value);
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
proto.provenance.metadata.v1.ScopeSpecIdInfo.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.provenance.metadata.v1.ScopeSpecIdInfo.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.provenance.metadata.v1.ScopeSpecIdInfo} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.ScopeSpecIdInfo.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getScopeSpecId_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      1,
      f
    );
  }
  f = message.getScopeSpecIdPrefix_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      2,
      f
    );
  }
  f = message.getScopeSpecIdScopeSpecUuid_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      3,
      f
    );
  }
  f = message.getScopeSpecAddr();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getScopeSpecUuid();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
};


/**
 * optional bytes scope_spec_id = 1;
 * @return {string}
 */
proto.provenance.metadata.v1.ScopeSpecIdInfo.prototype.getScopeSpecId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * optional bytes scope_spec_id = 1;
 * This is a type-conversion wrapper around `getScopeSpecId()`
 * @return {string}
 */
proto.provenance.metadata.v1.ScopeSpecIdInfo.prototype.getScopeSpecId_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getScopeSpecId()));
};


/**
 * optional bytes scope_spec_id = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getScopeSpecId()`
 * @return {!Uint8Array}
 */
proto.provenance.metadata.v1.ScopeSpecIdInfo.prototype.getScopeSpecId_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getScopeSpecId()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.provenance.metadata.v1.ScopeSpecIdInfo} returns this
 */
proto.provenance.metadata.v1.ScopeSpecIdInfo.prototype.setScopeSpecId = function(value) {
  return jspb.Message.setProto3BytesField(this, 1, value);
};


/**
 * optional bytes scope_spec_id_prefix = 2;
 * @return {string}
 */
proto.provenance.metadata.v1.ScopeSpecIdInfo.prototype.getScopeSpecIdPrefix = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * optional bytes scope_spec_id_prefix = 2;
 * This is a type-conversion wrapper around `getScopeSpecIdPrefix()`
 * @return {string}
 */
proto.provenance.metadata.v1.ScopeSpecIdInfo.prototype.getScopeSpecIdPrefix_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getScopeSpecIdPrefix()));
};


/**
 * optional bytes scope_spec_id_prefix = 2;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getScopeSpecIdPrefix()`
 * @return {!Uint8Array}
 */
proto.provenance.metadata.v1.ScopeSpecIdInfo.prototype.getScopeSpecIdPrefix_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getScopeSpecIdPrefix()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.provenance.metadata.v1.ScopeSpecIdInfo} returns this
 */
proto.provenance.metadata.v1.ScopeSpecIdInfo.prototype.setScopeSpecIdPrefix = function(value) {
  return jspb.Message.setProto3BytesField(this, 2, value);
};


/**
 * optional bytes scope_spec_id_scope_spec_uuid = 3;
 * @return {string}
 */
proto.provenance.metadata.v1.ScopeSpecIdInfo.prototype.getScopeSpecIdScopeSpecUuid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * optional bytes scope_spec_id_scope_spec_uuid = 3;
 * This is a type-conversion wrapper around `getScopeSpecIdScopeSpecUuid()`
 * @return {string}
 */
proto.provenance.metadata.v1.ScopeSpecIdInfo.prototype.getScopeSpecIdScopeSpecUuid_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getScopeSpecIdScopeSpecUuid()));
};


/**
 * optional bytes scope_spec_id_scope_spec_uuid = 3;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getScopeSpecIdScopeSpecUuid()`
 * @return {!Uint8Array}
 */
proto.provenance.metadata.v1.ScopeSpecIdInfo.prototype.getScopeSpecIdScopeSpecUuid_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getScopeSpecIdScopeSpecUuid()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.provenance.metadata.v1.ScopeSpecIdInfo} returns this
 */
proto.provenance.metadata.v1.ScopeSpecIdInfo.prototype.setScopeSpecIdScopeSpecUuid = function(value) {
  return jspb.Message.setProto3BytesField(this, 3, value);
};


/**
 * optional string scope_spec_addr = 4;
 * @return {string}
 */
proto.provenance.metadata.v1.ScopeSpecIdInfo.prototype.getScopeSpecAddr = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.metadata.v1.ScopeSpecIdInfo} returns this
 */
proto.provenance.metadata.v1.ScopeSpecIdInfo.prototype.setScopeSpecAddr = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string scope_spec_uuid = 5;
 * @return {string}
 */
proto.provenance.metadata.v1.ScopeSpecIdInfo.prototype.getScopeSpecUuid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.metadata.v1.ScopeSpecIdInfo} returns this
 */
proto.provenance.metadata.v1.ScopeSpecIdInfo.prototype.setScopeSpecUuid = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


