// source: pstake/lscosmos/v1beta1/lscosmos.proto
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

goog.provide('proto.pstake.lscosmos.v1beta1.HostAccountUndelegation');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');
goog.require('proto.google.protobuf.Timestamp');
goog.require('proto.pstake.lscosmos.v1beta1.UndelegationEntry');

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
proto.pstake.lscosmos.v1beta1.HostAccountUndelegation = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.pstake.lscosmos.v1beta1.HostAccountUndelegation.repeatedFields_, null);
};
goog.inherits(proto.pstake.lscosmos.v1beta1.HostAccountUndelegation, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.pstake.lscosmos.v1beta1.HostAccountUndelegation.displayName = 'proto.pstake.lscosmos.v1beta1.HostAccountUndelegation';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.pstake.lscosmos.v1beta1.HostAccountUndelegation.repeatedFields_ = [4];



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
proto.pstake.lscosmos.v1beta1.HostAccountUndelegation.prototype.toObject = function(opt_includeInstance) {
  return proto.pstake.lscosmos.v1beta1.HostAccountUndelegation.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.pstake.lscosmos.v1beta1.HostAccountUndelegation} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.pstake.lscosmos.v1beta1.HostAccountUndelegation.toObject = function(includeInstance, msg) {
  var f, obj = {
    epochNumber: jspb.Message.getFieldWithDefault(msg, 1, 0),
    totalUndelegationAmount: (f = msg.getTotalUndelegationAmount()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    completionTime: (f = msg.getCompletionTime()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    undelegationEntriesList: jspb.Message.toObjectList(msg.getUndelegationEntriesList(),
    proto.pstake.lscosmos.v1beta1.UndelegationEntry.toObject, includeInstance)
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
 * @return {!proto.pstake.lscosmos.v1beta1.HostAccountUndelegation}
 */
proto.pstake.lscosmos.v1beta1.HostAccountUndelegation.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.pstake.lscosmos.v1beta1.HostAccountUndelegation;
  return proto.pstake.lscosmos.v1beta1.HostAccountUndelegation.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.pstake.lscosmos.v1beta1.HostAccountUndelegation} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.pstake.lscosmos.v1beta1.HostAccountUndelegation}
 */
proto.pstake.lscosmos.v1beta1.HostAccountUndelegation.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setEpochNumber(value);
      break;
    case 2:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setTotalUndelegationAmount(value);
      break;
    case 3:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setCompletionTime(value);
      break;
    case 4:
      var value = new proto.pstake.lscosmos.v1beta1.UndelegationEntry;
      reader.readMessage(value,proto.pstake.lscosmos.v1beta1.UndelegationEntry.deserializeBinaryFromReader);
      msg.addUndelegationEntries(value);
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
proto.pstake.lscosmos.v1beta1.HostAccountUndelegation.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.pstake.lscosmos.v1beta1.HostAccountUndelegation.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.pstake.lscosmos.v1beta1.HostAccountUndelegation} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.pstake.lscosmos.v1beta1.HostAccountUndelegation.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getEpochNumber();
  if (f !== 0) {
    writer.writeInt64(
      1,
      f
    );
  }
  f = message.getTotalUndelegationAmount();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getCompletionTime();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getUndelegationEntriesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.pstake.lscosmos.v1beta1.UndelegationEntry.serializeBinaryToWriter
    );
  }
};


/**
 * optional int64 epoch_number = 1;
 * @return {number}
 */
proto.pstake.lscosmos.v1beta1.HostAccountUndelegation.prototype.getEpochNumber = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.pstake.lscosmos.v1beta1.HostAccountUndelegation} returns this
 */
proto.pstake.lscosmos.v1beta1.HostAccountUndelegation.prototype.setEpochNumber = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional cosmos.base.v1beta1.Coin total_undelegation_amount = 2;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.pstake.lscosmos.v1beta1.HostAccountUndelegation.prototype.getTotalUndelegationAmount = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 2));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.pstake.lscosmos.v1beta1.HostAccountUndelegation} returns this
*/
proto.pstake.lscosmos.v1beta1.HostAccountUndelegation.prototype.setTotalUndelegationAmount = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.pstake.lscosmos.v1beta1.HostAccountUndelegation} returns this
 */
proto.pstake.lscosmos.v1beta1.HostAccountUndelegation.prototype.clearTotalUndelegationAmount = function() {
  return this.setTotalUndelegationAmount(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.pstake.lscosmos.v1beta1.HostAccountUndelegation.prototype.hasTotalUndelegationAmount = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional google.protobuf.Timestamp completion_time = 3;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.pstake.lscosmos.v1beta1.HostAccountUndelegation.prototype.getCompletionTime = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 3));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.pstake.lscosmos.v1beta1.HostAccountUndelegation} returns this
*/
proto.pstake.lscosmos.v1beta1.HostAccountUndelegation.prototype.setCompletionTime = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.pstake.lscosmos.v1beta1.HostAccountUndelegation} returns this
 */
proto.pstake.lscosmos.v1beta1.HostAccountUndelegation.prototype.clearCompletionTime = function() {
  return this.setCompletionTime(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.pstake.lscosmos.v1beta1.HostAccountUndelegation.prototype.hasCompletionTime = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * repeated UndelegationEntry undelegation_entries = 4;
 * @return {!Array<!proto.pstake.lscosmos.v1beta1.UndelegationEntry>}
 */
proto.pstake.lscosmos.v1beta1.HostAccountUndelegation.prototype.getUndelegationEntriesList = function() {
  return /** @type{!Array<!proto.pstake.lscosmos.v1beta1.UndelegationEntry>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.pstake.lscosmos.v1beta1.UndelegationEntry, 4));
};


/**
 * @param {!Array<!proto.pstake.lscosmos.v1beta1.UndelegationEntry>} value
 * @return {!proto.pstake.lscosmos.v1beta1.HostAccountUndelegation} returns this
*/
proto.pstake.lscosmos.v1beta1.HostAccountUndelegation.prototype.setUndelegationEntriesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.pstake.lscosmos.v1beta1.UndelegationEntry=} opt_value
 * @param {number=} opt_index
 * @return {!proto.pstake.lscosmos.v1beta1.UndelegationEntry}
 */
proto.pstake.lscosmos.v1beta1.HostAccountUndelegation.prototype.addUndelegationEntries = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.pstake.lscosmos.v1beta1.UndelegationEntry, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.pstake.lscosmos.v1beta1.HostAccountUndelegation} returns this
 */
proto.pstake.lscosmos.v1beta1.HostAccountUndelegation.prototype.clearUndelegationEntriesList = function() {
  return this.setUndelegationEntriesList([]);
};

