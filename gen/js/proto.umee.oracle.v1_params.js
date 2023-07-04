// source: umee/oracle/v1/oracle.proto
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

goog.provide('proto.umee.oracle.v1.Params');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.umee.oracle.v1.Denom');

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
proto.umee.oracle.v1.Params = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.umee.oracle.v1.Params.repeatedFields_, null);
};
goog.inherits(proto.umee.oracle.v1.Params, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.umee.oracle.v1.Params.displayName = 'proto.umee.oracle.v1.Params';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.umee.oracle.v1.Params.repeatedFields_ = [5];



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
proto.umee.oracle.v1.Params.prototype.toObject = function(opt_includeInstance) {
  return proto.umee.oracle.v1.Params.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.umee.oracle.v1.Params} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.umee.oracle.v1.Params.toObject = function(includeInstance, msg) {
  var f, obj = {
    votePeriod: jspb.Message.getFieldWithDefault(msg, 1, 0),
    voteThreshold: jspb.Message.getFieldWithDefault(msg, 2, ""),
    rewardBand: jspb.Message.getFieldWithDefault(msg, 3, ""),
    rewardDistributionWindow: jspb.Message.getFieldWithDefault(msg, 4, 0),
    acceptListList: jspb.Message.toObjectList(msg.getAcceptListList(),
    proto.umee.oracle.v1.Denom.toObject, includeInstance),
    slashFraction: jspb.Message.getFieldWithDefault(msg, 6, ""),
    slashWindow: jspb.Message.getFieldWithDefault(msg, 7, 0),
    minValidPerWindow: jspb.Message.getFieldWithDefault(msg, 8, ""),
    historicStampPeriod: jspb.Message.getFieldWithDefault(msg, 9, 0),
    medianStampPeriod: jspb.Message.getFieldWithDefault(msg, 10, 0),
    maximumPriceStamps: jspb.Message.getFieldWithDefault(msg, 11, 0),
    maximumMedianStamps: jspb.Message.getFieldWithDefault(msg, 12, 0)
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
 * @return {!proto.umee.oracle.v1.Params}
 */
proto.umee.oracle.v1.Params.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.umee.oracle.v1.Params;
  return proto.umee.oracle.v1.Params.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.umee.oracle.v1.Params} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.umee.oracle.v1.Params}
 */
proto.umee.oracle.v1.Params.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setVotePeriod(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setVoteThreshold(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setRewardBand(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setRewardDistributionWindow(value);
      break;
    case 5:
      var value = new proto.umee.oracle.v1.Denom;
      reader.readMessage(value,proto.umee.oracle.v1.Denom.deserializeBinaryFromReader);
      msg.addAcceptList(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setSlashFraction(value);
      break;
    case 7:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setSlashWindow(value);
      break;
    case 8:
      var value = /** @type {string} */ (reader.readString());
      msg.setMinValidPerWindow(value);
      break;
    case 9:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setHistoricStampPeriod(value);
      break;
    case 10:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setMedianStampPeriod(value);
      break;
    case 11:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setMaximumPriceStamps(value);
      break;
    case 12:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setMaximumMedianStamps(value);
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
proto.umee.oracle.v1.Params.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.umee.oracle.v1.Params.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.umee.oracle.v1.Params} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.umee.oracle.v1.Params.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getVotePeriod();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getVoteThreshold();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getRewardBand();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getRewardDistributionWindow();
  if (f !== 0) {
    writer.writeUint64(
      4,
      f
    );
  }
  f = message.getAcceptListList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      5,
      f,
      proto.umee.oracle.v1.Denom.serializeBinaryToWriter
    );
  }
  f = message.getSlashFraction();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getSlashWindow();
  if (f !== 0) {
    writer.writeUint64(
      7,
      f
    );
  }
  f = message.getMinValidPerWindow();
  if (f.length > 0) {
    writer.writeString(
      8,
      f
    );
  }
  f = message.getHistoricStampPeriod();
  if (f !== 0) {
    writer.writeUint64(
      9,
      f
    );
  }
  f = message.getMedianStampPeriod();
  if (f !== 0) {
    writer.writeUint64(
      10,
      f
    );
  }
  f = message.getMaximumPriceStamps();
  if (f !== 0) {
    writer.writeUint64(
      11,
      f
    );
  }
  f = message.getMaximumMedianStamps();
  if (f !== 0) {
    writer.writeUint64(
      12,
      f
    );
  }
};


/**
 * optional uint64 vote_period = 1;
 * @return {number}
 */
proto.umee.oracle.v1.Params.prototype.getVotePeriod = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.umee.oracle.v1.Params} returns this
 */
proto.umee.oracle.v1.Params.prototype.setVotePeriod = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional string vote_threshold = 2;
 * @return {string}
 */
proto.umee.oracle.v1.Params.prototype.getVoteThreshold = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.umee.oracle.v1.Params} returns this
 */
proto.umee.oracle.v1.Params.prototype.setVoteThreshold = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string reward_band = 3;
 * @return {string}
 */
proto.umee.oracle.v1.Params.prototype.getRewardBand = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.umee.oracle.v1.Params} returns this
 */
proto.umee.oracle.v1.Params.prototype.setRewardBand = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional uint64 reward_distribution_window = 4;
 * @return {number}
 */
proto.umee.oracle.v1.Params.prototype.getRewardDistributionWindow = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.umee.oracle.v1.Params} returns this
 */
proto.umee.oracle.v1.Params.prototype.setRewardDistributionWindow = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * repeated Denom accept_list = 5;
 * @return {!Array<!proto.umee.oracle.v1.Denom>}
 */
proto.umee.oracle.v1.Params.prototype.getAcceptListList = function() {
  return /** @type{!Array<!proto.umee.oracle.v1.Denom>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.umee.oracle.v1.Denom, 5));
};


/**
 * @param {!Array<!proto.umee.oracle.v1.Denom>} value
 * @return {!proto.umee.oracle.v1.Params} returns this
*/
proto.umee.oracle.v1.Params.prototype.setAcceptListList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 5, value);
};


/**
 * @param {!proto.umee.oracle.v1.Denom=} opt_value
 * @param {number=} opt_index
 * @return {!proto.umee.oracle.v1.Denom}
 */
proto.umee.oracle.v1.Params.prototype.addAcceptList = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 5, opt_value, proto.umee.oracle.v1.Denom, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.umee.oracle.v1.Params} returns this
 */
proto.umee.oracle.v1.Params.prototype.clearAcceptListList = function() {
  return this.setAcceptListList([]);
};


/**
 * optional string slash_fraction = 6;
 * @return {string}
 */
proto.umee.oracle.v1.Params.prototype.getSlashFraction = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.umee.oracle.v1.Params} returns this
 */
proto.umee.oracle.v1.Params.prototype.setSlashFraction = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * optional uint64 slash_window = 7;
 * @return {number}
 */
proto.umee.oracle.v1.Params.prototype.getSlashWindow = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 7, 0));
};


/**
 * @param {number} value
 * @return {!proto.umee.oracle.v1.Params} returns this
 */
proto.umee.oracle.v1.Params.prototype.setSlashWindow = function(value) {
  return jspb.Message.setProto3IntField(this, 7, value);
};


/**
 * optional string min_valid_per_window = 8;
 * @return {string}
 */
proto.umee.oracle.v1.Params.prototype.getMinValidPerWindow = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 8, ""));
};


/**
 * @param {string} value
 * @return {!proto.umee.oracle.v1.Params} returns this
 */
proto.umee.oracle.v1.Params.prototype.setMinValidPerWindow = function(value) {
  return jspb.Message.setProto3StringField(this, 8, value);
};


/**
 * optional uint64 historic_stamp_period = 9;
 * @return {number}
 */
proto.umee.oracle.v1.Params.prototype.getHistoricStampPeriod = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 9, 0));
};


/**
 * @param {number} value
 * @return {!proto.umee.oracle.v1.Params} returns this
 */
proto.umee.oracle.v1.Params.prototype.setHistoricStampPeriod = function(value) {
  return jspb.Message.setProto3IntField(this, 9, value);
};


/**
 * optional uint64 median_stamp_period = 10;
 * @return {number}
 */
proto.umee.oracle.v1.Params.prototype.getMedianStampPeriod = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 10, 0));
};


/**
 * @param {number} value
 * @return {!proto.umee.oracle.v1.Params} returns this
 */
proto.umee.oracle.v1.Params.prototype.setMedianStampPeriod = function(value) {
  return jspb.Message.setProto3IntField(this, 10, value);
};


/**
 * optional uint64 maximum_price_stamps = 11;
 * @return {number}
 */
proto.umee.oracle.v1.Params.prototype.getMaximumPriceStamps = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 11, 0));
};


/**
 * @param {number} value
 * @return {!proto.umee.oracle.v1.Params} returns this
 */
proto.umee.oracle.v1.Params.prototype.setMaximumPriceStamps = function(value) {
  return jspb.Message.setProto3IntField(this, 11, value);
};


/**
 * optional uint64 maximum_median_stamps = 12;
 * @return {number}
 */
proto.umee.oracle.v1.Params.prototype.getMaximumMedianStamps = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 12, 0));
};


/**
 * @param {number} value
 * @return {!proto.umee.oracle.v1.Params} returns this
 */
proto.umee.oracle.v1.Params.prototype.setMaximumMedianStamps = function(value) {
  return jspb.Message.setProto3IntField(this, 12, value);
};

