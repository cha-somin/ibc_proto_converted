// source: irismod/service/tx.proto
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

goog.provide('proto.irismod.service.MsgRefundServiceDeposit');

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
proto.irismod.service.MsgRefundServiceDeposit = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.irismod.service.MsgRefundServiceDeposit, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.irismod.service.MsgRefundServiceDeposit.displayName = 'proto.irismod.service.MsgRefundServiceDeposit';
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
proto.irismod.service.MsgRefundServiceDeposit.prototype.toObject = function(opt_includeInstance) {
  return proto.irismod.service.MsgRefundServiceDeposit.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.irismod.service.MsgRefundServiceDeposit} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.irismod.service.MsgRefundServiceDeposit.toObject = function(includeInstance, msg) {
  var f, obj = {
    serviceName: jspb.Message.getFieldWithDefault(msg, 1, ""),
    provider: jspb.Message.getFieldWithDefault(msg, 2, ""),
    owner: jspb.Message.getFieldWithDefault(msg, 3, "")
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
 * @return {!proto.irismod.service.MsgRefundServiceDeposit}
 */
proto.irismod.service.MsgRefundServiceDeposit.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.irismod.service.MsgRefundServiceDeposit;
  return proto.irismod.service.MsgRefundServiceDeposit.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.irismod.service.MsgRefundServiceDeposit} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.irismod.service.MsgRefundServiceDeposit}
 */
proto.irismod.service.MsgRefundServiceDeposit.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setServiceName(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setProvider(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setOwner(value);
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
proto.irismod.service.MsgRefundServiceDeposit.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.irismod.service.MsgRefundServiceDeposit.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.irismod.service.MsgRefundServiceDeposit} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.irismod.service.MsgRefundServiceDeposit.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getServiceName();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getProvider();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getOwner();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
};


/**
 * optional string service_name = 1;
 * @return {string}
 */
proto.irismod.service.MsgRefundServiceDeposit.prototype.getServiceName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.irismod.service.MsgRefundServiceDeposit} returns this
 */
proto.irismod.service.MsgRefundServiceDeposit.prototype.setServiceName = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string provider = 2;
 * @return {string}
 */
proto.irismod.service.MsgRefundServiceDeposit.prototype.getProvider = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.irismod.service.MsgRefundServiceDeposit} returns this
 */
proto.irismod.service.MsgRefundServiceDeposit.prototype.setProvider = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string owner = 3;
 * @return {string}
 */
proto.irismod.service.MsgRefundServiceDeposit.prototype.getOwner = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.irismod.service.MsgRefundServiceDeposit} returns this
 */
proto.irismod.service.MsgRefundServiceDeposit.prototype.setOwner = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


