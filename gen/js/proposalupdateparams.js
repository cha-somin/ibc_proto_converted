// source: lum-network/millions/gov.proto
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

goog.provide('proto.lum.network.millions.ProposalUpdateParams');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Duration');

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
proto.lum.network.millions.ProposalUpdateParams = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.lum.network.millions.ProposalUpdateParams, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.lum.network.millions.ProposalUpdateParams.displayName = 'proto.lum.network.millions.ProposalUpdateParams';
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
proto.lum.network.millions.ProposalUpdateParams.prototype.toObject = function(opt_includeInstance) {
  return proto.lum.network.millions.ProposalUpdateParams.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.lum.network.millions.ProposalUpdateParams} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lum.network.millions.ProposalUpdateParams.toObject = function(includeInstance, msg) {
  var f, obj = {
    title: jspb.Message.getFieldWithDefault(msg, 1, ""),
    description: jspb.Message.getFieldWithDefault(msg, 2, ""),
    minDepositAmount: jspb.Message.getFieldWithDefault(msg, 3, ""),
    maxPrizeStrategyBatches: jspb.Message.getFieldWithDefault(msg, 4, ""),
    maxPrizeBatchQuantity: jspb.Message.getFieldWithDefault(msg, 5, ""),
    minDrawScheduleDelta: (f = msg.getMinDrawScheduleDelta()) && proto.google.protobuf.Duration.toObject(includeInstance, f),
    maxDrawScheduleDelta: (f = msg.getMaxDrawScheduleDelta()) && proto.google.protobuf.Duration.toObject(includeInstance, f),
    prizeExpirationDelta: (f = msg.getPrizeExpirationDelta()) && proto.google.protobuf.Duration.toObject(includeInstance, f),
    feesStakers: jspb.Message.getFieldWithDefault(msg, 9, ""),
    minDepositDrawDelta: (f = msg.getMinDepositDrawDelta()) && proto.google.protobuf.Duration.toObject(includeInstance, f)
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
 * @return {!proto.lum.network.millions.ProposalUpdateParams}
 */
proto.lum.network.millions.ProposalUpdateParams.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.lum.network.millions.ProposalUpdateParams;
  return proto.lum.network.millions.ProposalUpdateParams.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.lum.network.millions.ProposalUpdateParams} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.lum.network.millions.ProposalUpdateParams}
 */
proto.lum.network.millions.ProposalUpdateParams.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setTitle(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setDescription(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setMinDepositAmount(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setMaxPrizeStrategyBatches(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setMaxPrizeBatchQuantity(value);
      break;
    case 6:
      var value = new proto.google.protobuf.Duration;
      reader.readMessage(value,proto.google.protobuf.Duration.deserializeBinaryFromReader);
      msg.setMinDrawScheduleDelta(value);
      break;
    case 7:
      var value = new proto.google.protobuf.Duration;
      reader.readMessage(value,proto.google.protobuf.Duration.deserializeBinaryFromReader);
      msg.setMaxDrawScheduleDelta(value);
      break;
    case 8:
      var value = new proto.google.protobuf.Duration;
      reader.readMessage(value,proto.google.protobuf.Duration.deserializeBinaryFromReader);
      msg.setPrizeExpirationDelta(value);
      break;
    case 9:
      var value = /** @type {string} */ (reader.readString());
      msg.setFeesStakers(value);
      break;
    case 10:
      var value = new proto.google.protobuf.Duration;
      reader.readMessage(value,proto.google.protobuf.Duration.deserializeBinaryFromReader);
      msg.setMinDepositDrawDelta(value);
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
proto.lum.network.millions.ProposalUpdateParams.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.lum.network.millions.ProposalUpdateParams.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.lum.network.millions.ProposalUpdateParams} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lum.network.millions.ProposalUpdateParams.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getTitle();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getDescription();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getMinDepositAmount();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getMaxPrizeStrategyBatches();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getMaxPrizeBatchQuantity();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getMinDrawScheduleDelta();
  if (f != null) {
    writer.writeMessage(
      6,
      f,
      proto.google.protobuf.Duration.serializeBinaryToWriter
    );
  }
  f = message.getMaxDrawScheduleDelta();
  if (f != null) {
    writer.writeMessage(
      7,
      f,
      proto.google.protobuf.Duration.serializeBinaryToWriter
    );
  }
  f = message.getPrizeExpirationDelta();
  if (f != null) {
    writer.writeMessage(
      8,
      f,
      proto.google.protobuf.Duration.serializeBinaryToWriter
    );
  }
  f = message.getFeesStakers();
  if (f.length > 0) {
    writer.writeString(
      9,
      f
    );
  }
  f = message.getMinDepositDrawDelta();
  if (f != null) {
    writer.writeMessage(
      10,
      f,
      proto.google.protobuf.Duration.serializeBinaryToWriter
    );
  }
};


/**
 * optional string title = 1;
 * @return {string}
 */
proto.lum.network.millions.ProposalUpdateParams.prototype.getTitle = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.lum.network.millions.ProposalUpdateParams} returns this
 */
proto.lum.network.millions.ProposalUpdateParams.prototype.setTitle = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string description = 2;
 * @return {string}
 */
proto.lum.network.millions.ProposalUpdateParams.prototype.getDescription = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.lum.network.millions.ProposalUpdateParams} returns this
 */
proto.lum.network.millions.ProposalUpdateParams.prototype.setDescription = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string min_deposit_amount = 3;
 * @return {string}
 */
proto.lum.network.millions.ProposalUpdateParams.prototype.getMinDepositAmount = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.lum.network.millions.ProposalUpdateParams} returns this
 */
proto.lum.network.millions.ProposalUpdateParams.prototype.setMinDepositAmount = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string max_prize_strategy_batches = 4;
 * @return {string}
 */
proto.lum.network.millions.ProposalUpdateParams.prototype.getMaxPrizeStrategyBatches = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.lum.network.millions.ProposalUpdateParams} returns this
 */
proto.lum.network.millions.ProposalUpdateParams.prototype.setMaxPrizeStrategyBatches = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string max_prize_batch_quantity = 5;
 * @return {string}
 */
proto.lum.network.millions.ProposalUpdateParams.prototype.getMaxPrizeBatchQuantity = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.lum.network.millions.ProposalUpdateParams} returns this
 */
proto.lum.network.millions.ProposalUpdateParams.prototype.setMaxPrizeBatchQuantity = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional google.protobuf.Duration min_draw_schedule_delta = 6;
 * @return {?proto.google.protobuf.Duration}
 */
proto.lum.network.millions.ProposalUpdateParams.prototype.getMinDrawScheduleDelta = function() {
  return /** @type{?proto.google.protobuf.Duration} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Duration, 6));
};


/**
 * @param {?proto.google.protobuf.Duration|undefined} value
 * @return {!proto.lum.network.millions.ProposalUpdateParams} returns this
*/
proto.lum.network.millions.ProposalUpdateParams.prototype.setMinDrawScheduleDelta = function(value) {
  return jspb.Message.setWrapperField(this, 6, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.lum.network.millions.ProposalUpdateParams} returns this
 */
proto.lum.network.millions.ProposalUpdateParams.prototype.clearMinDrawScheduleDelta = function() {
  return this.setMinDrawScheduleDelta(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.lum.network.millions.ProposalUpdateParams.prototype.hasMinDrawScheduleDelta = function() {
  return jspb.Message.getField(this, 6) != null;
};


/**
 * optional google.protobuf.Duration max_draw_schedule_delta = 7;
 * @return {?proto.google.protobuf.Duration}
 */
proto.lum.network.millions.ProposalUpdateParams.prototype.getMaxDrawScheduleDelta = function() {
  return /** @type{?proto.google.protobuf.Duration} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Duration, 7));
};


/**
 * @param {?proto.google.protobuf.Duration|undefined} value
 * @return {!proto.lum.network.millions.ProposalUpdateParams} returns this
*/
proto.lum.network.millions.ProposalUpdateParams.prototype.setMaxDrawScheduleDelta = function(value) {
  return jspb.Message.setWrapperField(this, 7, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.lum.network.millions.ProposalUpdateParams} returns this
 */
proto.lum.network.millions.ProposalUpdateParams.prototype.clearMaxDrawScheduleDelta = function() {
  return this.setMaxDrawScheduleDelta(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.lum.network.millions.ProposalUpdateParams.prototype.hasMaxDrawScheduleDelta = function() {
  return jspb.Message.getField(this, 7) != null;
};


/**
 * optional google.protobuf.Duration prize_expiration_delta = 8;
 * @return {?proto.google.protobuf.Duration}
 */
proto.lum.network.millions.ProposalUpdateParams.prototype.getPrizeExpirationDelta = function() {
  return /** @type{?proto.google.protobuf.Duration} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Duration, 8));
};


/**
 * @param {?proto.google.protobuf.Duration|undefined} value
 * @return {!proto.lum.network.millions.ProposalUpdateParams} returns this
*/
proto.lum.network.millions.ProposalUpdateParams.prototype.setPrizeExpirationDelta = function(value) {
  return jspb.Message.setWrapperField(this, 8, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.lum.network.millions.ProposalUpdateParams} returns this
 */
proto.lum.network.millions.ProposalUpdateParams.prototype.clearPrizeExpirationDelta = function() {
  return this.setPrizeExpirationDelta(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.lum.network.millions.ProposalUpdateParams.prototype.hasPrizeExpirationDelta = function() {
  return jspb.Message.getField(this, 8) != null;
};


/**
 * optional string fees_stakers = 9;
 * @return {string}
 */
proto.lum.network.millions.ProposalUpdateParams.prototype.getFeesStakers = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 9, ""));
};


/**
 * @param {string} value
 * @return {!proto.lum.network.millions.ProposalUpdateParams} returns this
 */
proto.lum.network.millions.ProposalUpdateParams.prototype.setFeesStakers = function(value) {
  return jspb.Message.setProto3StringField(this, 9, value);
};


/**
 * optional google.protobuf.Duration min_deposit_draw_delta = 10;
 * @return {?proto.google.protobuf.Duration}
 */
proto.lum.network.millions.ProposalUpdateParams.prototype.getMinDepositDrawDelta = function() {
  return /** @type{?proto.google.protobuf.Duration} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Duration, 10));
};


/**
 * @param {?proto.google.protobuf.Duration|undefined} value
 * @return {!proto.lum.network.millions.ProposalUpdateParams} returns this
*/
proto.lum.network.millions.ProposalUpdateParams.prototype.setMinDepositDrawDelta = function(value) {
  return jspb.Message.setWrapperField(this, 10, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.lum.network.millions.ProposalUpdateParams} returns this
 */
proto.lum.network.millions.ProposalUpdateParams.prototype.clearMinDepositDrawDelta = function() {
  return this.setMinDepositDrawDelta(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.lum.network.millions.ProposalUpdateParams.prototype.hasMinDepositDrawDelta = function() {
  return jspb.Message.getField(this, 10) != null;
};


