// source: persistence/oracle/v1beta1/query.proto
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

goog.provide('proto.persistence.oracle.v1beta1.QueryRewardPoolBalanceResponse');

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
proto.persistence.oracle.v1beta1.QueryRewardPoolBalanceResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.persistence.oracle.v1beta1.QueryRewardPoolBalanceResponse.repeatedFields_, null);
};
goog.inherits(proto.persistence.oracle.v1beta1.QueryRewardPoolBalanceResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.persistence.oracle.v1beta1.QueryRewardPoolBalanceResponse.displayName = 'proto.persistence.oracle.v1beta1.QueryRewardPoolBalanceResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.persistence.oracle.v1beta1.QueryRewardPoolBalanceResponse.repeatedFields_ = [1];



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
proto.persistence.oracle.v1beta1.QueryRewardPoolBalanceResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.persistence.oracle.v1beta1.QueryRewardPoolBalanceResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.persistence.oracle.v1beta1.QueryRewardPoolBalanceResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.persistence.oracle.v1beta1.QueryRewardPoolBalanceResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    remainingFundsList: jspb.Message.toObjectList(msg.getRemainingFundsList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance)
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
 * @return {!proto.persistence.oracle.v1beta1.QueryRewardPoolBalanceResponse}
 */
proto.persistence.oracle.v1beta1.QueryRewardPoolBalanceResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.persistence.oracle.v1beta1.QueryRewardPoolBalanceResponse;
  return proto.persistence.oracle.v1beta1.QueryRewardPoolBalanceResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.persistence.oracle.v1beta1.QueryRewardPoolBalanceResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.persistence.oracle.v1beta1.QueryRewardPoolBalanceResponse}
 */
proto.persistence.oracle.v1beta1.QueryRewardPoolBalanceResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addRemainingFunds(value);
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
proto.persistence.oracle.v1beta1.QueryRewardPoolBalanceResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.persistence.oracle.v1beta1.QueryRewardPoolBalanceResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.persistence.oracle.v1beta1.QueryRewardPoolBalanceResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.persistence.oracle.v1beta1.QueryRewardPoolBalanceResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getRemainingFundsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
};


/**
 * repeated cosmos.base.v1beta1.Coin remaining_funds = 1;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.persistence.oracle.v1beta1.QueryRewardPoolBalanceResponse.prototype.getRemainingFundsList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 1));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.persistence.oracle.v1beta1.QueryRewardPoolBalanceResponse} returns this
*/
proto.persistence.oracle.v1beta1.QueryRewardPoolBalanceResponse.prototype.setRemainingFundsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.persistence.oracle.v1beta1.QueryRewardPoolBalanceResponse.prototype.addRemainingFunds = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.persistence.oracle.v1beta1.QueryRewardPoolBalanceResponse} returns this
 */
proto.persistence.oracle.v1beta1.QueryRewardPoolBalanceResponse.prototype.clearRemainingFundsList = function() {
  return this.setRemainingFundsList([]);
};


