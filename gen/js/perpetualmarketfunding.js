// source: injective/exchange/v1beta1/exchange.proto
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

goog.provide('proto.injective.exchange.v1beta1.PerpetualMarketFunding');

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
proto.injective.exchange.v1beta1.PerpetualMarketFunding = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.injective.exchange.v1beta1.PerpetualMarketFunding, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.exchange.v1beta1.PerpetualMarketFunding.displayName = 'proto.injective.exchange.v1beta1.PerpetualMarketFunding';
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
proto.injective.exchange.v1beta1.PerpetualMarketFunding.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.exchange.v1beta1.PerpetualMarketFunding.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.exchange.v1beta1.PerpetualMarketFunding} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.PerpetualMarketFunding.toObject = function(includeInstance, msg) {
  var f, obj = {
    cumulativeFunding: jspb.Message.getFieldWithDefault(msg, 1, ""),
    cumulativePrice: jspb.Message.getFieldWithDefault(msg, 2, ""),
    lastTimestamp: jspb.Message.getFieldWithDefault(msg, 3, 0)
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
 * @return {!proto.injective.exchange.v1beta1.PerpetualMarketFunding}
 */
proto.injective.exchange.v1beta1.PerpetualMarketFunding.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.exchange.v1beta1.PerpetualMarketFunding;
  return proto.injective.exchange.v1beta1.PerpetualMarketFunding.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.exchange.v1beta1.PerpetualMarketFunding} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.exchange.v1beta1.PerpetualMarketFunding}
 */
proto.injective.exchange.v1beta1.PerpetualMarketFunding.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setCumulativeFunding(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setCumulativePrice(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setLastTimestamp(value);
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
proto.injective.exchange.v1beta1.PerpetualMarketFunding.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.exchange.v1beta1.PerpetualMarketFunding.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.exchange.v1beta1.PerpetualMarketFunding} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.PerpetualMarketFunding.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getCumulativeFunding();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getCumulativePrice();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getLastTimestamp();
  if (f !== 0) {
    writer.writeInt64(
      3,
      f
    );
  }
};


/**
 * optional string cumulative_funding = 1;
 * @return {string}
 */
proto.injective.exchange.v1beta1.PerpetualMarketFunding.prototype.getCumulativeFunding = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.PerpetualMarketFunding} returns this
 */
proto.injective.exchange.v1beta1.PerpetualMarketFunding.prototype.setCumulativeFunding = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string cumulative_price = 2;
 * @return {string}
 */
proto.injective.exchange.v1beta1.PerpetualMarketFunding.prototype.getCumulativePrice = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.PerpetualMarketFunding} returns this
 */
proto.injective.exchange.v1beta1.PerpetualMarketFunding.prototype.setCumulativePrice = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional int64 last_timestamp = 3;
 * @return {number}
 */
proto.injective.exchange.v1beta1.PerpetualMarketFunding.prototype.getLastTimestamp = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.exchange.v1beta1.PerpetualMarketFunding} returns this
 */
proto.injective.exchange.v1beta1.PerpetualMarketFunding.prototype.setLastTimestamp = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


