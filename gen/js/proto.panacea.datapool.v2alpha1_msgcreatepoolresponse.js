// source: panacea/datapool/v2alpha1/tx.proto
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

goog.provide('proto.panacea.datapool.v2alpha1.MsgCreatePoolResponse');

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
proto.panacea.datapool.v2alpha1.MsgCreatePoolResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.panacea.datapool.v2alpha1.MsgCreatePoolResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.panacea.datapool.v2alpha1.MsgCreatePoolResponse.displayName = 'proto.panacea.datapool.v2alpha1.MsgCreatePoolResponse';
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
proto.panacea.datapool.v2alpha1.MsgCreatePoolResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.panacea.datapool.v2alpha1.MsgCreatePoolResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.panacea.datapool.v2alpha1.MsgCreatePoolResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.panacea.datapool.v2alpha1.MsgCreatePoolResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    poolId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    round: jspb.Message.getFieldWithDefault(msg, 2, 0),
    curationNftId: jspb.Message.getFieldWithDefault(msg, 3, 0)
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
 * @return {!proto.panacea.datapool.v2alpha1.MsgCreatePoolResponse}
 */
proto.panacea.datapool.v2alpha1.MsgCreatePoolResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.panacea.datapool.v2alpha1.MsgCreatePoolResponse;
  return proto.panacea.datapool.v2alpha1.MsgCreatePoolResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.panacea.datapool.v2alpha1.MsgCreatePoolResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.panacea.datapool.v2alpha1.MsgCreatePoolResponse}
 */
proto.panacea.datapool.v2alpha1.MsgCreatePoolResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setPoolId(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setRound(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setCurationNftId(value);
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
proto.panacea.datapool.v2alpha1.MsgCreatePoolResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.panacea.datapool.v2alpha1.MsgCreatePoolResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.panacea.datapool.v2alpha1.MsgCreatePoolResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.panacea.datapool.v2alpha1.MsgCreatePoolResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPoolId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getRound();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getCurationNftId();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
};


/**
 * optional uint64 pool_id = 1;
 * @return {number}
 */
proto.panacea.datapool.v2alpha1.MsgCreatePoolResponse.prototype.getPoolId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.panacea.datapool.v2alpha1.MsgCreatePoolResponse} returns this
 */
proto.panacea.datapool.v2alpha1.MsgCreatePoolResponse.prototype.setPoolId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint64 round = 2;
 * @return {number}
 */
proto.panacea.datapool.v2alpha1.MsgCreatePoolResponse.prototype.getRound = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.panacea.datapool.v2alpha1.MsgCreatePoolResponse} returns this
 */
proto.panacea.datapool.v2alpha1.MsgCreatePoolResponse.prototype.setRound = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional uint64 curation_nft_id = 3;
 * @return {number}
 */
proto.panacea.datapool.v2alpha1.MsgCreatePoolResponse.prototype.getCurationNftId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.panacea.datapool.v2alpha1.MsgCreatePoolResponse} returns this
 */
proto.panacea.datapool.v2alpha1.MsgCreatePoolResponse.prototype.setCurationNftId = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


