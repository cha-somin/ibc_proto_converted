// source: akash/base/v1beta3/endpoint.proto
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

goog.provide('proto.akash.base.v1beta3.Endpoint');
goog.provide('proto.akash.base.v1beta3.Endpoint.Kind');

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
proto.akash.base.v1beta3.Endpoint = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.akash.base.v1beta3.Endpoint, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.akash.base.v1beta3.Endpoint.displayName = 'proto.akash.base.v1beta3.Endpoint';
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
proto.akash.base.v1beta3.Endpoint.prototype.toObject = function(opt_includeInstance) {
  return proto.akash.base.v1beta3.Endpoint.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.akash.base.v1beta3.Endpoint} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.akash.base.v1beta3.Endpoint.toObject = function(includeInstance, msg) {
  var f, obj = {
    kind: jspb.Message.getFieldWithDefault(msg, 1, 0),
    sequenceNumber: jspb.Message.getFieldWithDefault(msg, 2, 0)
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
 * @return {!proto.akash.base.v1beta3.Endpoint}
 */
proto.akash.base.v1beta3.Endpoint.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.akash.base.v1beta3.Endpoint;
  return proto.akash.base.v1beta3.Endpoint.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.akash.base.v1beta3.Endpoint} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.akash.base.v1beta3.Endpoint}
 */
proto.akash.base.v1beta3.Endpoint.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!proto.akash.base.v1beta3.Endpoint.Kind} */ (reader.readEnum());
      msg.setKind(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setSequenceNumber(value);
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
proto.akash.base.v1beta3.Endpoint.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.akash.base.v1beta3.Endpoint.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.akash.base.v1beta3.Endpoint} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.akash.base.v1beta3.Endpoint.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getKind();
  if (f !== 0.0) {
    writer.writeEnum(
      1,
      f
    );
  }
  f = message.getSequenceNumber();
  if (f !== 0) {
    writer.writeUint32(
      2,
      f
    );
  }
};


/**
 * @enum {number}
 */
proto.akash.base.v1beta3.Endpoint.Kind = {
  SHARED_HTTP: 0,
  RANDOM_PORT: 1,
  LEASED_IP: 2
};

/**
 * optional Kind kind = 1;
 * @return {!proto.akash.base.v1beta3.Endpoint.Kind}
 */
proto.akash.base.v1beta3.Endpoint.prototype.getKind = function() {
  return /** @type {!proto.akash.base.v1beta3.Endpoint.Kind} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {!proto.akash.base.v1beta3.Endpoint.Kind} value
 * @return {!proto.akash.base.v1beta3.Endpoint} returns this
 */
proto.akash.base.v1beta3.Endpoint.prototype.setKind = function(value) {
  return jspb.Message.setProto3EnumField(this, 1, value);
};


/**
 * optional uint32 sequence_number = 2;
 * @return {number}
 */
proto.akash.base.v1beta3.Endpoint.prototype.getSequenceNumber = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.akash.base.v1beta3.Endpoint} returns this
 */
proto.akash.base.v1beta3.Endpoint.prototype.setSequenceNumber = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


