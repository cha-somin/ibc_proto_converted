// source: crescent/lpfarm/v1beta1/tx.proto
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

goog.provide('proto.crescent.lpfarm.v1beta1.MsgUnfarm');

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
proto.crescent.lpfarm.v1beta1.MsgUnfarm = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.crescent.lpfarm.v1beta1.MsgUnfarm, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.crescent.lpfarm.v1beta1.MsgUnfarm.displayName = 'proto.crescent.lpfarm.v1beta1.MsgUnfarm';
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
proto.crescent.lpfarm.v1beta1.MsgUnfarm.prototype.toObject = function(opt_includeInstance) {
  return proto.crescent.lpfarm.v1beta1.MsgUnfarm.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.crescent.lpfarm.v1beta1.MsgUnfarm} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.crescent.lpfarm.v1beta1.MsgUnfarm.toObject = function(includeInstance, msg) {
  var f, obj = {
    farmer: jspb.Message.getFieldWithDefault(msg, 1, ""),
    coin: (f = msg.getCoin()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f)
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
 * @return {!proto.crescent.lpfarm.v1beta1.MsgUnfarm}
 */
proto.crescent.lpfarm.v1beta1.MsgUnfarm.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.crescent.lpfarm.v1beta1.MsgUnfarm;
  return proto.crescent.lpfarm.v1beta1.MsgUnfarm.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.crescent.lpfarm.v1beta1.MsgUnfarm} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.crescent.lpfarm.v1beta1.MsgUnfarm}
 */
proto.crescent.lpfarm.v1beta1.MsgUnfarm.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setFarmer(value);
      break;
    case 2:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setCoin(value);
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
proto.crescent.lpfarm.v1beta1.MsgUnfarm.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.crescent.lpfarm.v1beta1.MsgUnfarm.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.crescent.lpfarm.v1beta1.MsgUnfarm} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.crescent.lpfarm.v1beta1.MsgUnfarm.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getFarmer();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getCoin();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
};


/**
 * optional string farmer = 1;
 * @return {string}
 */
proto.crescent.lpfarm.v1beta1.MsgUnfarm.prototype.getFarmer = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.crescent.lpfarm.v1beta1.MsgUnfarm} returns this
 */
proto.crescent.lpfarm.v1beta1.MsgUnfarm.prototype.setFarmer = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional cosmos.base.v1beta1.Coin coin = 2;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.crescent.lpfarm.v1beta1.MsgUnfarm.prototype.getCoin = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 2));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.crescent.lpfarm.v1beta1.MsgUnfarm} returns this
*/
proto.crescent.lpfarm.v1beta1.MsgUnfarm.prototype.setCoin = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.crescent.lpfarm.v1beta1.MsgUnfarm} returns this
 */
proto.crescent.lpfarm.v1beta1.MsgUnfarm.prototype.clearCoin = function() {
  return this.setCoin(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.crescent.lpfarm.v1beta1.MsgUnfarm.prototype.hasCoin = function() {
  return jspb.Message.getField(this, 2) != null;
};


