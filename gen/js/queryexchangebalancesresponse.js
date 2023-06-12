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

goog.provide('proto.injective.exchange.v1beta1.QueryExchangeBalancesResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.injective.exchange.v1beta1.Balance');

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
proto.injective.exchange.v1beta1.QueryExchangeBalancesResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.injective.exchange.v1beta1.QueryExchangeBalancesResponse.repeatedFields_, null);
};
goog.inherits(proto.injective.exchange.v1beta1.QueryExchangeBalancesResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.exchange.v1beta1.QueryExchangeBalancesResponse.displayName = 'proto.injective.exchange.v1beta1.QueryExchangeBalancesResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.injective.exchange.v1beta1.QueryExchangeBalancesResponse.repeatedFields_ = [1];



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
proto.injective.exchange.v1beta1.QueryExchangeBalancesResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.exchange.v1beta1.QueryExchangeBalancesResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.exchange.v1beta1.QueryExchangeBalancesResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.QueryExchangeBalancesResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    balancesList: jspb.Message.toObjectList(msg.getBalancesList(),
    proto.injective.exchange.v1beta1.Balance.toObject, includeInstance)
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
 * @return {!proto.injective.exchange.v1beta1.QueryExchangeBalancesResponse}
 */
proto.injective.exchange.v1beta1.QueryExchangeBalancesResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.exchange.v1beta1.QueryExchangeBalancesResponse;
  return proto.injective.exchange.v1beta1.QueryExchangeBalancesResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.exchange.v1beta1.QueryExchangeBalancesResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.exchange.v1beta1.QueryExchangeBalancesResponse}
 */
proto.injective.exchange.v1beta1.QueryExchangeBalancesResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.injective.exchange.v1beta1.Balance;
      reader.readMessage(value,proto.injective.exchange.v1beta1.Balance.deserializeBinaryFromReader);
      msg.addBalances(value);
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
proto.injective.exchange.v1beta1.QueryExchangeBalancesResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.exchange.v1beta1.QueryExchangeBalancesResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.exchange.v1beta1.QueryExchangeBalancesResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.QueryExchangeBalancesResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getBalancesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.injective.exchange.v1beta1.Balance.serializeBinaryToWriter
    );
  }
};


/**
 * repeated Balance balances = 1;
 * @return {!Array<!proto.injective.exchange.v1beta1.Balance>}
 */
proto.injective.exchange.v1beta1.QueryExchangeBalancesResponse.prototype.getBalancesList = function() {
  return /** @type{!Array<!proto.injective.exchange.v1beta1.Balance>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.injective.exchange.v1beta1.Balance, 1));
};


/**
 * @param {!Array<!proto.injective.exchange.v1beta1.Balance>} value
 * @return {!proto.injective.exchange.v1beta1.QueryExchangeBalancesResponse} returns this
*/
proto.injective.exchange.v1beta1.QueryExchangeBalancesResponse.prototype.setBalancesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.injective.exchange.v1beta1.Balance=} opt_value
 * @param {number=} opt_index
 * @return {!proto.injective.exchange.v1beta1.Balance}
 */
proto.injective.exchange.v1beta1.QueryExchangeBalancesResponse.prototype.addBalances = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.injective.exchange.v1beta1.Balance, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.exchange.v1beta1.QueryExchangeBalancesResponse} returns this
 */
proto.injective.exchange.v1beta1.QueryExchangeBalancesResponse.prototype.clearBalancesList = function() {
  return this.setBalancesList([]);
};


