// source: comdex/locker/v1beta1/tx.proto
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

goog.provide('proto.comdex.locker.v1beta1.MsgCloseLockerRequest');

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
proto.comdex.locker.v1beta1.MsgCloseLockerRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.comdex.locker.v1beta1.MsgCloseLockerRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.comdex.locker.v1beta1.MsgCloseLockerRequest.displayName = 'proto.comdex.locker.v1beta1.MsgCloseLockerRequest';
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
proto.comdex.locker.v1beta1.MsgCloseLockerRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.comdex.locker.v1beta1.MsgCloseLockerRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.comdex.locker.v1beta1.MsgCloseLockerRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.locker.v1beta1.MsgCloseLockerRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    depositor: jspb.Message.getFieldWithDefault(msg, 1, ""),
    appId: jspb.Message.getFieldWithDefault(msg, 2, 0),
    assetId: jspb.Message.getFieldWithDefault(msg, 3, 0),
    lockerId: jspb.Message.getFieldWithDefault(msg, 4, 0)
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
 * @return {!proto.comdex.locker.v1beta1.MsgCloseLockerRequest}
 */
proto.comdex.locker.v1beta1.MsgCloseLockerRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.comdex.locker.v1beta1.MsgCloseLockerRequest;
  return proto.comdex.locker.v1beta1.MsgCloseLockerRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.comdex.locker.v1beta1.MsgCloseLockerRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.comdex.locker.v1beta1.MsgCloseLockerRequest}
 */
proto.comdex.locker.v1beta1.MsgCloseLockerRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setDepositor(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setAppId(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setAssetId(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setLockerId(value);
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
proto.comdex.locker.v1beta1.MsgCloseLockerRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.comdex.locker.v1beta1.MsgCloseLockerRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.comdex.locker.v1beta1.MsgCloseLockerRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.locker.v1beta1.MsgCloseLockerRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDepositor();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getAppId();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getAssetId();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
  f = message.getLockerId();
  if (f !== 0) {
    writer.writeUint64(
      4,
      f
    );
  }
};


/**
 * optional string depositor = 1;
 * @return {string}
 */
proto.comdex.locker.v1beta1.MsgCloseLockerRequest.prototype.getDepositor = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.comdex.locker.v1beta1.MsgCloseLockerRequest} returns this
 */
proto.comdex.locker.v1beta1.MsgCloseLockerRequest.prototype.setDepositor = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional uint64 app_id = 2;
 * @return {number}
 */
proto.comdex.locker.v1beta1.MsgCloseLockerRequest.prototype.getAppId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.locker.v1beta1.MsgCloseLockerRequest} returns this
 */
proto.comdex.locker.v1beta1.MsgCloseLockerRequest.prototype.setAppId = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional uint64 asset_id = 3;
 * @return {number}
 */
proto.comdex.locker.v1beta1.MsgCloseLockerRequest.prototype.getAssetId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.locker.v1beta1.MsgCloseLockerRequest} returns this
 */
proto.comdex.locker.v1beta1.MsgCloseLockerRequest.prototype.setAssetId = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional uint64 locker_id = 4;
 * @return {number}
 */
proto.comdex.locker.v1beta1.MsgCloseLockerRequest.prototype.getLockerId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.locker.v1beta1.MsgCloseLockerRequest} returns this
 */
proto.comdex.locker.v1beta1.MsgCloseLockerRequest.prototype.setLockerId = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};

