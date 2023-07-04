// source: kava/hard/v1beta1/hard.proto
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

goog.provide('proto.kava.hard.v1beta1.Params');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.kava.hard.v1beta1.MoneyMarket');

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
proto.kava.hard.v1beta1.Params = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.kava.hard.v1beta1.Params.repeatedFields_, null);
};
goog.inherits(proto.kava.hard.v1beta1.Params, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kava.hard.v1beta1.Params.displayName = 'proto.kava.hard.v1beta1.Params';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.kava.hard.v1beta1.Params.repeatedFields_ = [1];



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
proto.kava.hard.v1beta1.Params.prototype.toObject = function(opt_includeInstance) {
  return proto.kava.hard.v1beta1.Params.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kava.hard.v1beta1.Params} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.hard.v1beta1.Params.toObject = function(includeInstance, msg) {
  var f, obj = {
    moneyMarketsList: jspb.Message.toObjectList(msg.getMoneyMarketsList(),
    proto.kava.hard.v1beta1.MoneyMarket.toObject, includeInstance),
    minimumBorrowUsdValue: jspb.Message.getFieldWithDefault(msg, 2, "")
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
 * @return {!proto.kava.hard.v1beta1.Params}
 */
proto.kava.hard.v1beta1.Params.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kava.hard.v1beta1.Params;
  return proto.kava.hard.v1beta1.Params.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kava.hard.v1beta1.Params} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kava.hard.v1beta1.Params}
 */
proto.kava.hard.v1beta1.Params.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.kava.hard.v1beta1.MoneyMarket;
      reader.readMessage(value,proto.kava.hard.v1beta1.MoneyMarket.deserializeBinaryFromReader);
      msg.addMoneyMarkets(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setMinimumBorrowUsdValue(value);
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
proto.kava.hard.v1beta1.Params.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kava.hard.v1beta1.Params.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kava.hard.v1beta1.Params} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.hard.v1beta1.Params.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getMoneyMarketsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.kava.hard.v1beta1.MoneyMarket.serializeBinaryToWriter
    );
  }
  f = message.getMinimumBorrowUsdValue();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
};


/**
 * repeated MoneyMarket money_markets = 1;
 * @return {!Array<!proto.kava.hard.v1beta1.MoneyMarket>}
 */
proto.kava.hard.v1beta1.Params.prototype.getMoneyMarketsList = function() {
  return /** @type{!Array<!proto.kava.hard.v1beta1.MoneyMarket>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.kava.hard.v1beta1.MoneyMarket, 1));
};


/**
 * @param {!Array<!proto.kava.hard.v1beta1.MoneyMarket>} value
 * @return {!proto.kava.hard.v1beta1.Params} returns this
*/
proto.kava.hard.v1beta1.Params.prototype.setMoneyMarketsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.kava.hard.v1beta1.MoneyMarket=} opt_value
 * @param {number=} opt_index
 * @return {!proto.kava.hard.v1beta1.MoneyMarket}
 */
proto.kava.hard.v1beta1.Params.prototype.addMoneyMarkets = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.kava.hard.v1beta1.MoneyMarket, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.kava.hard.v1beta1.Params} returns this
 */
proto.kava.hard.v1beta1.Params.prototype.clearMoneyMarketsList = function() {
  return this.setMoneyMarketsList([]);
};


/**
 * optional string minimum_borrow_usd_value = 2;
 * @return {string}
 */
proto.kava.hard.v1beta1.Params.prototype.getMinimumBorrowUsdValue = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.kava.hard.v1beta1.Params} returns this
 */
proto.kava.hard.v1beta1.Params.prototype.setMinimumBorrowUsdValue = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};

