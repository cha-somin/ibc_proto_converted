// source: comdex/liquidity/v1beta1/liquidity.proto
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

goog.provide('proto.comdex.liquidity.v1beta1.QueuedCoin');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');
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
proto.comdex.liquidity.v1beta1.QueuedCoin = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.comdex.liquidity.v1beta1.QueuedCoin, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.comdex.liquidity.v1beta1.QueuedCoin.displayName = 'proto.comdex.liquidity.v1beta1.QueuedCoin';
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
proto.comdex.liquidity.v1beta1.QueuedCoin.prototype.toObject = function(opt_includeInstance) {
  return proto.comdex.liquidity.v1beta1.QueuedCoin.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.comdex.liquidity.v1beta1.QueuedCoin} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.liquidity.v1beta1.QueuedCoin.toObject = function(includeInstance, msg) {
  var f, obj = {
    farmedPoolCoin: (f = msg.getFarmedPoolCoin()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    createdAt: (f = msg.getCreatedAt()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f)
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
 * @return {!proto.comdex.liquidity.v1beta1.QueuedCoin}
 */
proto.comdex.liquidity.v1beta1.QueuedCoin.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.comdex.liquidity.v1beta1.QueuedCoin;
  return proto.comdex.liquidity.v1beta1.QueuedCoin.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.comdex.liquidity.v1beta1.QueuedCoin} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.comdex.liquidity.v1beta1.QueuedCoin}
 */
proto.comdex.liquidity.v1beta1.QueuedCoin.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setFarmedPoolCoin(value);
      break;
    case 2:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setCreatedAt(value);
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
proto.comdex.liquidity.v1beta1.QueuedCoin.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.comdex.liquidity.v1beta1.QueuedCoin.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.comdex.liquidity.v1beta1.QueuedCoin} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.liquidity.v1beta1.QueuedCoin.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getFarmedPoolCoin();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getCreatedAt();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
};


/**
 * optional cosmos.base.v1beta1.Coin farmed_pool_coin = 1;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.comdex.liquidity.v1beta1.QueuedCoin.prototype.getFarmedPoolCoin = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 1));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.comdex.liquidity.v1beta1.QueuedCoin} returns this
*/
proto.comdex.liquidity.v1beta1.QueuedCoin.prototype.setFarmedPoolCoin = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.liquidity.v1beta1.QueuedCoin} returns this
 */
proto.comdex.liquidity.v1beta1.QueuedCoin.prototype.clearFarmedPoolCoin = function() {
  return this.setFarmedPoolCoin(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.liquidity.v1beta1.QueuedCoin.prototype.hasFarmedPoolCoin = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional google.protobuf.Timestamp created_at = 2;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.comdex.liquidity.v1beta1.QueuedCoin.prototype.getCreatedAt = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 2));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.comdex.liquidity.v1beta1.QueuedCoin} returns this
*/
proto.comdex.liquidity.v1beta1.QueuedCoin.prototype.setCreatedAt = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.liquidity.v1beta1.QueuedCoin} returns this
 */
proto.comdex.liquidity.v1beta1.QueuedCoin.prototype.clearCreatedAt = function() {
  return this.setCreatedAt(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.liquidity.v1beta1.QueuedCoin.prototype.hasCreatedAt = function() {
  return jspb.Message.getField(this, 2) != null;
};


