// source: provenance/metadata/v1/events.proto
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

goog.provide('proto.provenance.metadata.v1.EventRecordUpdated');

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
proto.provenance.metadata.v1.EventRecordUpdated = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.provenance.metadata.v1.EventRecordUpdated, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.provenance.metadata.v1.EventRecordUpdated.displayName = 'proto.provenance.metadata.v1.EventRecordUpdated';
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
proto.provenance.metadata.v1.EventRecordUpdated.prototype.toObject = function(opt_includeInstance) {
  return proto.provenance.metadata.v1.EventRecordUpdated.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.provenance.metadata.v1.EventRecordUpdated} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.EventRecordUpdated.toObject = function(includeInstance, msg) {
  var f, obj = {
    recordAddr: jspb.Message.getFieldWithDefault(msg, 1, ""),
    sessionAddr: jspb.Message.getFieldWithDefault(msg, 2, ""),
    scopeAddr: jspb.Message.getFieldWithDefault(msg, 3, "")
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
 * @return {!proto.provenance.metadata.v1.EventRecordUpdated}
 */
proto.provenance.metadata.v1.EventRecordUpdated.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.provenance.metadata.v1.EventRecordUpdated;
  return proto.provenance.metadata.v1.EventRecordUpdated.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.provenance.metadata.v1.EventRecordUpdated} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.provenance.metadata.v1.EventRecordUpdated}
 */
proto.provenance.metadata.v1.EventRecordUpdated.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setRecordAddr(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setSessionAddr(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setScopeAddr(value);
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
proto.provenance.metadata.v1.EventRecordUpdated.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.provenance.metadata.v1.EventRecordUpdated.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.provenance.metadata.v1.EventRecordUpdated} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.EventRecordUpdated.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getRecordAddr();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getSessionAddr();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getScopeAddr();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
};


/**
 * optional string record_addr = 1;
 * @return {string}
 */
proto.provenance.metadata.v1.EventRecordUpdated.prototype.getRecordAddr = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.metadata.v1.EventRecordUpdated} returns this
 */
proto.provenance.metadata.v1.EventRecordUpdated.prototype.setRecordAddr = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string session_addr = 2;
 * @return {string}
 */
proto.provenance.metadata.v1.EventRecordUpdated.prototype.getSessionAddr = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.metadata.v1.EventRecordUpdated} returns this
 */
proto.provenance.metadata.v1.EventRecordUpdated.prototype.setSessionAddr = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string scope_addr = 3;
 * @return {string}
 */
proto.provenance.metadata.v1.EventRecordUpdated.prototype.getScopeAddr = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.metadata.v1.EventRecordUpdated} returns this
 */
proto.provenance.metadata.v1.EventRecordUpdated.prototype.setScopeAddr = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


