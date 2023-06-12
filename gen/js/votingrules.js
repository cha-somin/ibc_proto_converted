// source: confio/poe/v1beta1/genesis.proto
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

goog.provide('proto.confio.poe.v1beta1.VotingRules');

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
proto.confio.poe.v1beta1.VotingRules = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.confio.poe.v1beta1.VotingRules, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.confio.poe.v1beta1.VotingRules.displayName = 'proto.confio.poe.v1beta1.VotingRules';
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
proto.confio.poe.v1beta1.VotingRules.prototype.toObject = function(opt_includeInstance) {
  return proto.confio.poe.v1beta1.VotingRules.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.confio.poe.v1beta1.VotingRules} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.confio.poe.v1beta1.VotingRules.toObject = function(includeInstance, msg) {
  var f, obj = {
    votingPeriod: jspb.Message.getFieldWithDefault(msg, 1, 0),
    quorum: jspb.Message.getFieldWithDefault(msg, 2, ""),
    threshold: jspb.Message.getFieldWithDefault(msg, 3, ""),
    allowEndEarly: jspb.Message.getBooleanFieldWithDefault(msg, 4, false)
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
 * @return {!proto.confio.poe.v1beta1.VotingRules}
 */
proto.confio.poe.v1beta1.VotingRules.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.confio.poe.v1beta1.VotingRules;
  return proto.confio.poe.v1beta1.VotingRules.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.confio.poe.v1beta1.VotingRules} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.confio.poe.v1beta1.VotingRules}
 */
proto.confio.poe.v1beta1.VotingRules.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setVotingPeriod(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setQuorum(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setThreshold(value);
      break;
    case 4:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setAllowEndEarly(value);
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
proto.confio.poe.v1beta1.VotingRules.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.confio.poe.v1beta1.VotingRules.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.confio.poe.v1beta1.VotingRules} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.confio.poe.v1beta1.VotingRules.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getVotingPeriod();
  if (f !== 0) {
    writer.writeUint32(
      1,
      f
    );
  }
  f = message.getQuorum();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getThreshold();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getAllowEndEarly();
  if (f) {
    writer.writeBool(
      4,
      f
    );
  }
};


/**
 * optional uint32 voting_period = 1;
 * @return {number}
 */
proto.confio.poe.v1beta1.VotingRules.prototype.getVotingPeriod = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.confio.poe.v1beta1.VotingRules} returns this
 */
proto.confio.poe.v1beta1.VotingRules.prototype.setVotingPeriod = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional string quorum = 2;
 * @return {string}
 */
proto.confio.poe.v1beta1.VotingRules.prototype.getQuorum = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.confio.poe.v1beta1.VotingRules} returns this
 */
proto.confio.poe.v1beta1.VotingRules.prototype.setQuorum = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string threshold = 3;
 * @return {string}
 */
proto.confio.poe.v1beta1.VotingRules.prototype.getThreshold = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.confio.poe.v1beta1.VotingRules} returns this
 */
proto.confio.poe.v1beta1.VotingRules.prototype.setThreshold = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional bool allow_end_early = 4;
 * @return {boolean}
 */
proto.confio.poe.v1beta1.VotingRules.prototype.getAllowEndEarly = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 4, false));
};


/**
 * @param {boolean} value
 * @return {!proto.confio.poe.v1beta1.VotingRules} returns this
 */
proto.confio.poe.v1beta1.VotingRules.prototype.setAllowEndEarly = function(value) {
  return jspb.Message.setProto3BooleanField(this, 4, value);
};


