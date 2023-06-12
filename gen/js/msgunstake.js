// source: irismod/farm/tx.proto
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

goog.provide('proto.irismod.farm.MsgUnstake');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');

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
proto.irismod.farm.MsgUnstake = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.irismod.farm.MsgUnstake, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.irismod.farm.MsgUnstake.displayName = 'proto.irismod.farm.MsgUnstake';
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
proto.irismod.farm.MsgUnstake.prototype.toObject = function(opt_includeInstance) {
  return proto.irismod.farm.MsgUnstake.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.irismod.farm.MsgUnstake} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.irismod.farm.MsgUnstake.toObject = function(includeInstance, msg) {
  var f, obj = {
    poolName: jspb.Message.getFieldWithDefault(msg, 1, ""),
    amount: (f = msg.getAmount()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    sender: jspb.Message.getFieldWithDefault(msg, 3, "")
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
 * @return {!proto.irismod.farm.MsgUnstake}
 */
proto.irismod.farm.MsgUnstake.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.irismod.farm.MsgUnstake;
  return proto.irismod.farm.MsgUnstake.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.irismod.farm.MsgUnstake} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.irismod.farm.MsgUnstake}
 */
proto.irismod.farm.MsgUnstake.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setPoolName(value);
      break;
    case 2:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setAmount(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setSender(value);
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
proto.irismod.farm.MsgUnstake.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.irismod.farm.MsgUnstake.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.irismod.farm.MsgUnstake} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.irismod.farm.MsgUnstake.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPoolName();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getAmount();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getSender();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
};


/**
 * optional string pool_name = 1;
 * @return {string}
 */
proto.irismod.farm.MsgUnstake.prototype.getPoolName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.irismod.farm.MsgUnstake} returns this
 */
proto.irismod.farm.MsgUnstake.prototype.setPoolName = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional cosmos.base.v1beta1.Coin amount = 2;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.irismod.farm.MsgUnstake.prototype.getAmount = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 2));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.irismod.farm.MsgUnstake} returns this
*/
proto.irismod.farm.MsgUnstake.prototype.setAmount = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.irismod.farm.MsgUnstake} returns this
 */
proto.irismod.farm.MsgUnstake.prototype.clearAmount = function() {
  return this.setAmount(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.irismod.farm.MsgUnstake.prototype.hasAmount = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional string sender = 3;
 * @return {string}
 */
proto.irismod.farm.MsgUnstake.prototype.getSender = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.irismod.farm.MsgUnstake} returns this
 */
proto.irismod.farm.MsgUnstake.prototype.setSender = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


