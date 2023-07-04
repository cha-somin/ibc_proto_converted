// source: irismod/oracle/tx.proto
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

goog.provide('proto.irismod.oracle.MsgEditFeed');

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
proto.irismod.oracle.MsgEditFeed = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.irismod.oracle.MsgEditFeed.repeatedFields_, null);
};
goog.inherits(proto.irismod.oracle.MsgEditFeed, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.irismod.oracle.MsgEditFeed.displayName = 'proto.irismod.oracle.MsgEditFeed';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.irismod.oracle.MsgEditFeed.repeatedFields_ = [4,6];



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
proto.irismod.oracle.MsgEditFeed.prototype.toObject = function(opt_includeInstance) {
  return proto.irismod.oracle.MsgEditFeed.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.irismod.oracle.MsgEditFeed} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.irismod.oracle.MsgEditFeed.toObject = function(includeInstance, msg) {
  var f, obj = {
    feedName: jspb.Message.getFieldWithDefault(msg, 1, ""),
    description: jspb.Message.getFieldWithDefault(msg, 2, ""),
    latestHistory: jspb.Message.getFieldWithDefault(msg, 3, 0),
    providersList: (f = jspb.Message.getRepeatedField(msg, 4)) == null ? undefined : f,
    timeout: jspb.Message.getFieldWithDefault(msg, 5, 0),
    serviceFeeCapList: jspb.Message.toObjectList(msg.getServiceFeeCapList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance),
    repeatedFrequency: jspb.Message.getFieldWithDefault(msg, 7, 0),
    responseThreshold: jspb.Message.getFieldWithDefault(msg, 8, 0),
    creator: jspb.Message.getFieldWithDefault(msg, 9, "")
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
 * @return {!proto.irismod.oracle.MsgEditFeed}
 */
proto.irismod.oracle.MsgEditFeed.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.irismod.oracle.MsgEditFeed;
  return proto.irismod.oracle.MsgEditFeed.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.irismod.oracle.MsgEditFeed} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.irismod.oracle.MsgEditFeed}
 */
proto.irismod.oracle.MsgEditFeed.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setFeedName(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setDescription(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setLatestHistory(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.addProviders(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setTimeout(value);
      break;
    case 6:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addServiceFeeCap(value);
      break;
    case 7:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setRepeatedFrequency(value);
      break;
    case 8:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setResponseThreshold(value);
      break;
    case 9:
      var value = /** @type {string} */ (reader.readString());
      msg.setCreator(value);
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
proto.irismod.oracle.MsgEditFeed.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.irismod.oracle.MsgEditFeed.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.irismod.oracle.MsgEditFeed} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.irismod.oracle.MsgEditFeed.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getFeedName();
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
  f = message.getLatestHistory();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
  f = message.getProvidersList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      4,
      f
    );
  }
  f = message.getTimeout();
  if (f !== 0) {
    writer.writeInt64(
      5,
      f
    );
  }
  f = message.getServiceFeeCapList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      6,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getRepeatedFrequency();
  if (f !== 0) {
    writer.writeUint64(
      7,
      f
    );
  }
  f = message.getResponseThreshold();
  if (f !== 0) {
    writer.writeUint32(
      8,
      f
    );
  }
  f = message.getCreator();
  if (f.length > 0) {
    writer.writeString(
      9,
      f
    );
  }
};


/**
 * optional string feed_name = 1;
 * @return {string}
 */
proto.irismod.oracle.MsgEditFeed.prototype.getFeedName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.irismod.oracle.MsgEditFeed} returns this
 */
proto.irismod.oracle.MsgEditFeed.prototype.setFeedName = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string description = 2;
 * @return {string}
 */
proto.irismod.oracle.MsgEditFeed.prototype.getDescription = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.irismod.oracle.MsgEditFeed} returns this
 */
proto.irismod.oracle.MsgEditFeed.prototype.setDescription = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional uint64 latest_history = 3;
 * @return {number}
 */
proto.irismod.oracle.MsgEditFeed.prototype.getLatestHistory = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.irismod.oracle.MsgEditFeed} returns this
 */
proto.irismod.oracle.MsgEditFeed.prototype.setLatestHistory = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * repeated string providers = 4;
 * @return {!Array<string>}
 */
proto.irismod.oracle.MsgEditFeed.prototype.getProvidersList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 4));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.irismod.oracle.MsgEditFeed} returns this
 */
proto.irismod.oracle.MsgEditFeed.prototype.setProvidersList = function(value) {
  return jspb.Message.setField(this, 4, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.irismod.oracle.MsgEditFeed} returns this
 */
proto.irismod.oracle.MsgEditFeed.prototype.addProviders = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 4, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.irismod.oracle.MsgEditFeed} returns this
 */
proto.irismod.oracle.MsgEditFeed.prototype.clearProvidersList = function() {
  return this.setProvidersList([]);
};


/**
 * optional int64 timeout = 5;
 * @return {number}
 */
proto.irismod.oracle.MsgEditFeed.prototype.getTimeout = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.irismod.oracle.MsgEditFeed} returns this
 */
proto.irismod.oracle.MsgEditFeed.prototype.setTimeout = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


/**
 * repeated cosmos.base.v1beta1.Coin service_fee_cap = 6;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.irismod.oracle.MsgEditFeed.prototype.getServiceFeeCapList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 6));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.irismod.oracle.MsgEditFeed} returns this
*/
proto.irismod.oracle.MsgEditFeed.prototype.setServiceFeeCapList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 6, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.irismod.oracle.MsgEditFeed.prototype.addServiceFeeCap = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 6, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.irismod.oracle.MsgEditFeed} returns this
 */
proto.irismod.oracle.MsgEditFeed.prototype.clearServiceFeeCapList = function() {
  return this.setServiceFeeCapList([]);
};


/**
 * optional uint64 repeated_frequency = 7;
 * @return {number}
 */
proto.irismod.oracle.MsgEditFeed.prototype.getRepeatedFrequency = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 7, 0));
};


/**
 * @param {number} value
 * @return {!proto.irismod.oracle.MsgEditFeed} returns this
 */
proto.irismod.oracle.MsgEditFeed.prototype.setRepeatedFrequency = function(value) {
  return jspb.Message.setProto3IntField(this, 7, value);
};


/**
 * optional uint32 response_threshold = 8;
 * @return {number}
 */
proto.irismod.oracle.MsgEditFeed.prototype.getResponseThreshold = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 8, 0));
};


/**
 * @param {number} value
 * @return {!proto.irismod.oracle.MsgEditFeed} returns this
 */
proto.irismod.oracle.MsgEditFeed.prototype.setResponseThreshold = function(value) {
  return jspb.Message.setProto3IntField(this, 8, value);
};


/**
 * optional string creator = 9;
 * @return {string}
 */
proto.irismod.oracle.MsgEditFeed.prototype.getCreator = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 9, ""));
};


/**
 * @param {string} value
 * @return {!proto.irismod.oracle.MsgEditFeed} returns this
 */
proto.irismod.oracle.MsgEditFeed.prototype.setCreator = function(value) {
  return jspb.Message.setProto3StringField(this, 9, value);
};

