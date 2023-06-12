// source: injective/exchange/v1beta1/query.proto
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

goog.provide('proto.injective.exchange.v1beta1.QueryTraderDerivativeOrdersToCancelUpToAmountRequest');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

goog.forwardDeclare('proto.injective.exchange.v1beta1.CancellationStrategy');
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
proto.injective.exchange.v1beta1.QueryTraderDerivativeOrdersToCancelUpToAmountRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.injective.exchange.v1beta1.QueryTraderDerivativeOrdersToCancelUpToAmountRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.exchange.v1beta1.QueryTraderDerivativeOrdersToCancelUpToAmountRequest.displayName = 'proto.injective.exchange.v1beta1.QueryTraderDerivativeOrdersToCancelUpToAmountRequest';
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
proto.injective.exchange.v1beta1.QueryTraderDerivativeOrdersToCancelUpToAmountRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.exchange.v1beta1.QueryTraderDerivativeOrdersToCancelUpToAmountRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.exchange.v1beta1.QueryTraderDerivativeOrdersToCancelUpToAmountRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.QueryTraderDerivativeOrdersToCancelUpToAmountRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    marketId: jspb.Message.getFieldWithDefault(msg, 1, ""),
    subaccountId: jspb.Message.getFieldWithDefault(msg, 2, ""),
    quoteAmount: jspb.Message.getFieldWithDefault(msg, 3, ""),
    strategy: jspb.Message.getFieldWithDefault(msg, 4, 0),
    referencePrice: jspb.Message.getFieldWithDefault(msg, 5, "")
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
 * @return {!proto.injective.exchange.v1beta1.QueryTraderDerivativeOrdersToCancelUpToAmountRequest}
 */
proto.injective.exchange.v1beta1.QueryTraderDerivativeOrdersToCancelUpToAmountRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.exchange.v1beta1.QueryTraderDerivativeOrdersToCancelUpToAmountRequest;
  return proto.injective.exchange.v1beta1.QueryTraderDerivativeOrdersToCancelUpToAmountRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.exchange.v1beta1.QueryTraderDerivativeOrdersToCancelUpToAmountRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.exchange.v1beta1.QueryTraderDerivativeOrdersToCancelUpToAmountRequest}
 */
proto.injective.exchange.v1beta1.QueryTraderDerivativeOrdersToCancelUpToAmountRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setMarketId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setSubaccountId(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setQuoteAmount(value);
      break;
    case 4:
      var value = /** @type {!proto.injective.exchange.v1beta1.CancellationStrategy} */ (reader.readEnum());
      msg.setStrategy(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setReferencePrice(value);
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
proto.injective.exchange.v1beta1.QueryTraderDerivativeOrdersToCancelUpToAmountRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.exchange.v1beta1.QueryTraderDerivativeOrdersToCancelUpToAmountRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.exchange.v1beta1.QueryTraderDerivativeOrdersToCancelUpToAmountRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.QueryTraderDerivativeOrdersToCancelUpToAmountRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getMarketId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getSubaccountId();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getQuoteAmount();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getStrategy();
  if (f !== 0.0) {
    writer.writeEnum(
      4,
      f
    );
  }
  f = message.getReferencePrice();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
};


/**
 * optional string market_id = 1;
 * @return {string}
 */
proto.injective.exchange.v1beta1.QueryTraderDerivativeOrdersToCancelUpToAmountRequest.prototype.getMarketId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.QueryTraderDerivativeOrdersToCancelUpToAmountRequest} returns this
 */
proto.injective.exchange.v1beta1.QueryTraderDerivativeOrdersToCancelUpToAmountRequest.prototype.setMarketId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string subaccount_id = 2;
 * @return {string}
 */
proto.injective.exchange.v1beta1.QueryTraderDerivativeOrdersToCancelUpToAmountRequest.prototype.getSubaccountId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.QueryTraderDerivativeOrdersToCancelUpToAmountRequest} returns this
 */
proto.injective.exchange.v1beta1.QueryTraderDerivativeOrdersToCancelUpToAmountRequest.prototype.setSubaccountId = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string quote_amount = 3;
 * @return {string}
 */
proto.injective.exchange.v1beta1.QueryTraderDerivativeOrdersToCancelUpToAmountRequest.prototype.getQuoteAmount = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.QueryTraderDerivativeOrdersToCancelUpToAmountRequest} returns this
 */
proto.injective.exchange.v1beta1.QueryTraderDerivativeOrdersToCancelUpToAmountRequest.prototype.setQuoteAmount = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional CancellationStrategy strategy = 4;
 * @return {!proto.injective.exchange.v1beta1.CancellationStrategy}
 */
proto.injective.exchange.v1beta1.QueryTraderDerivativeOrdersToCancelUpToAmountRequest.prototype.getStrategy = function() {
  return /** @type {!proto.injective.exchange.v1beta1.CancellationStrategy} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {!proto.injective.exchange.v1beta1.CancellationStrategy} value
 * @return {!proto.injective.exchange.v1beta1.QueryTraderDerivativeOrdersToCancelUpToAmountRequest} returns this
 */
proto.injective.exchange.v1beta1.QueryTraderDerivativeOrdersToCancelUpToAmountRequest.prototype.setStrategy = function(value) {
  return jspb.Message.setProto3EnumField(this, 4, value);
};


/**
 * optional string reference_price = 5;
 * @return {string}
 */
proto.injective.exchange.v1beta1.QueryTraderDerivativeOrdersToCancelUpToAmountRequest.prototype.getReferencePrice = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.QueryTraderDerivativeOrdersToCancelUpToAmountRequest} returns this
 */
proto.injective.exchange.v1beta1.QueryTraderDerivativeOrdersToCancelUpToAmountRequest.prototype.setReferencePrice = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


