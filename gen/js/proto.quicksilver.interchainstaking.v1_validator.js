// source: quicksilver/interchainstaking/v1/interchainstaking.proto
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

goog.provide('proto.quicksilver.interchainstaking.v1.Validator');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
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
proto.quicksilver.interchainstaking.v1.Validator = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.quicksilver.interchainstaking.v1.Validator, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.quicksilver.interchainstaking.v1.Validator.displayName = 'proto.quicksilver.interchainstaking.v1.Validator';
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
proto.quicksilver.interchainstaking.v1.Validator.prototype.toObject = function(opt_includeInstance) {
  return proto.quicksilver.interchainstaking.v1.Validator.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.quicksilver.interchainstaking.v1.Validator} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.quicksilver.interchainstaking.v1.Validator.toObject = function(includeInstance, msg) {
  var f, obj = {
    valoperAddress: jspb.Message.getFieldWithDefault(msg, 1, ""),
    commissionRate: jspb.Message.getFieldWithDefault(msg, 2, ""),
    delegatorShares: jspb.Message.getFieldWithDefault(msg, 3, ""),
    votingPower: jspb.Message.getFieldWithDefault(msg, 4, ""),
    score: jspb.Message.getFieldWithDefault(msg, 5, ""),
    status: jspb.Message.getFieldWithDefault(msg, 6, ""),
    jailed: jspb.Message.getBooleanFieldWithDefault(msg, 7, false),
    tombstoned: jspb.Message.getBooleanFieldWithDefault(msg, 8, false),
    jailedSince: (f = msg.getJailedSince()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f)
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
 * @return {!proto.quicksilver.interchainstaking.v1.Validator}
 */
proto.quicksilver.interchainstaking.v1.Validator.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.quicksilver.interchainstaking.v1.Validator;
  return proto.quicksilver.interchainstaking.v1.Validator.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.quicksilver.interchainstaking.v1.Validator} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.quicksilver.interchainstaking.v1.Validator}
 */
proto.quicksilver.interchainstaking.v1.Validator.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setValoperAddress(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setCommissionRate(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setDelegatorShares(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setVotingPower(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setScore(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setStatus(value);
      break;
    case 7:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setJailed(value);
      break;
    case 8:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setTombstoned(value);
      break;
    case 9:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setJailedSince(value);
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
proto.quicksilver.interchainstaking.v1.Validator.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.quicksilver.interchainstaking.v1.Validator.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.quicksilver.interchainstaking.v1.Validator} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.quicksilver.interchainstaking.v1.Validator.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getValoperAddress();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getCommissionRate();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getDelegatorShares();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getVotingPower();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getScore();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getStatus();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getJailed();
  if (f) {
    writer.writeBool(
      7,
      f
    );
  }
  f = message.getTombstoned();
  if (f) {
    writer.writeBool(
      8,
      f
    );
  }
  f = message.getJailedSince();
  if (f != null) {
    writer.writeMessage(
      9,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
};


/**
 * optional string valoper_address = 1;
 * @return {string}
 */
proto.quicksilver.interchainstaking.v1.Validator.prototype.getValoperAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.quicksilver.interchainstaking.v1.Validator} returns this
 */
proto.quicksilver.interchainstaking.v1.Validator.prototype.setValoperAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string commission_rate = 2;
 * @return {string}
 */
proto.quicksilver.interchainstaking.v1.Validator.prototype.getCommissionRate = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.quicksilver.interchainstaking.v1.Validator} returns this
 */
proto.quicksilver.interchainstaking.v1.Validator.prototype.setCommissionRate = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string delegator_shares = 3;
 * @return {string}
 */
proto.quicksilver.interchainstaking.v1.Validator.prototype.getDelegatorShares = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.quicksilver.interchainstaking.v1.Validator} returns this
 */
proto.quicksilver.interchainstaking.v1.Validator.prototype.setDelegatorShares = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string voting_power = 4;
 * @return {string}
 */
proto.quicksilver.interchainstaking.v1.Validator.prototype.getVotingPower = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.quicksilver.interchainstaking.v1.Validator} returns this
 */
proto.quicksilver.interchainstaking.v1.Validator.prototype.setVotingPower = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string score = 5;
 * @return {string}
 */
proto.quicksilver.interchainstaking.v1.Validator.prototype.getScore = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.quicksilver.interchainstaking.v1.Validator} returns this
 */
proto.quicksilver.interchainstaking.v1.Validator.prototype.setScore = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional string status = 6;
 * @return {string}
 */
proto.quicksilver.interchainstaking.v1.Validator.prototype.getStatus = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.quicksilver.interchainstaking.v1.Validator} returns this
 */
proto.quicksilver.interchainstaking.v1.Validator.prototype.setStatus = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * optional bool jailed = 7;
 * @return {boolean}
 */
proto.quicksilver.interchainstaking.v1.Validator.prototype.getJailed = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 7, false));
};


/**
 * @param {boolean} value
 * @return {!proto.quicksilver.interchainstaking.v1.Validator} returns this
 */
proto.quicksilver.interchainstaking.v1.Validator.prototype.setJailed = function(value) {
  return jspb.Message.setProto3BooleanField(this, 7, value);
};


/**
 * optional bool tombstoned = 8;
 * @return {boolean}
 */
proto.quicksilver.interchainstaking.v1.Validator.prototype.getTombstoned = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 8, false));
};


/**
 * @param {boolean} value
 * @return {!proto.quicksilver.interchainstaking.v1.Validator} returns this
 */
proto.quicksilver.interchainstaking.v1.Validator.prototype.setTombstoned = function(value) {
  return jspb.Message.setProto3BooleanField(this, 8, value);
};


/**
 * optional google.protobuf.Timestamp jailed_since = 9;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.quicksilver.interchainstaking.v1.Validator.prototype.getJailedSince = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 9));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.quicksilver.interchainstaking.v1.Validator} returns this
*/
proto.quicksilver.interchainstaking.v1.Validator.prototype.setJailedSince = function(value) {
  return jspb.Message.setWrapperField(this, 9, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.quicksilver.interchainstaking.v1.Validator} returns this
 */
proto.quicksilver.interchainstaking.v1.Validator.prototype.clearJailedSince = function() {
  return this.setJailedSince(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.quicksilver.interchainstaking.v1.Validator.prototype.hasJailedSince = function() {
  return jspb.Message.getField(this, 9) != null;
};


