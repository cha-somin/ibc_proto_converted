// source: cosmos/gov/v1/tx.proto
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

goog.provide('proto.cosmos.gov.v1.MsgVoteWeighted');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.gov.v1.WeightedVoteOption');

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
proto.cosmos.gov.v1.MsgVoteWeighted = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cosmos.gov.v1.MsgVoteWeighted.repeatedFields_, null);
};
goog.inherits(proto.cosmos.gov.v1.MsgVoteWeighted, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.gov.v1.MsgVoteWeighted.displayName = 'proto.cosmos.gov.v1.MsgVoteWeighted';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cosmos.gov.v1.MsgVoteWeighted.repeatedFields_ = [3];



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
proto.cosmos.gov.v1.MsgVoteWeighted.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.gov.v1.MsgVoteWeighted.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.gov.v1.MsgVoteWeighted} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.gov.v1.MsgVoteWeighted.toObject = function(includeInstance, msg) {
  var f, obj = {
    proposalId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    voter: jspb.Message.getFieldWithDefault(msg, 2, ""),
    optionsList: jspb.Message.toObjectList(msg.getOptionsList(),
    proto.cosmos.gov.v1.WeightedVoteOption.toObject, includeInstance),
    metadata: jspb.Message.getFieldWithDefault(msg, 4, "")
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
 * @return {!proto.cosmos.gov.v1.MsgVoteWeighted}
 */
proto.cosmos.gov.v1.MsgVoteWeighted.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.gov.v1.MsgVoteWeighted;
  return proto.cosmos.gov.v1.MsgVoteWeighted.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.gov.v1.MsgVoteWeighted} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.gov.v1.MsgVoteWeighted}
 */
proto.cosmos.gov.v1.MsgVoteWeighted.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setProposalId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setVoter(value);
      break;
    case 3:
      var value = new proto.cosmos.gov.v1.WeightedVoteOption;
      reader.readMessage(value,proto.cosmos.gov.v1.WeightedVoteOption.deserializeBinaryFromReader);
      msg.addOptions(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setMetadata(value);
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
proto.cosmos.gov.v1.MsgVoteWeighted.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.gov.v1.MsgVoteWeighted.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.gov.v1.MsgVoteWeighted} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.gov.v1.MsgVoteWeighted.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getProposalId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getVoter();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getOptionsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.cosmos.gov.v1.WeightedVoteOption.serializeBinaryToWriter
    );
  }
  f = message.getMetadata();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
};


/**
 * optional uint64 proposal_id = 1;
 * @return {number}
 */
proto.cosmos.gov.v1.MsgVoteWeighted.prototype.getProposalId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.cosmos.gov.v1.MsgVoteWeighted} returns this
 */
proto.cosmos.gov.v1.MsgVoteWeighted.prototype.setProposalId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional string voter = 2;
 * @return {string}
 */
proto.cosmos.gov.v1.MsgVoteWeighted.prototype.getVoter = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.gov.v1.MsgVoteWeighted} returns this
 */
proto.cosmos.gov.v1.MsgVoteWeighted.prototype.setVoter = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * repeated WeightedVoteOption options = 3;
 * @return {!Array<!proto.cosmos.gov.v1.WeightedVoteOption>}
 */
proto.cosmos.gov.v1.MsgVoteWeighted.prototype.getOptionsList = function() {
  return /** @type{!Array<!proto.cosmos.gov.v1.WeightedVoteOption>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.gov.v1.WeightedVoteOption, 3));
};


/**
 * @param {!Array<!proto.cosmos.gov.v1.WeightedVoteOption>} value
 * @return {!proto.cosmos.gov.v1.MsgVoteWeighted} returns this
*/
proto.cosmos.gov.v1.MsgVoteWeighted.prototype.setOptionsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.cosmos.gov.v1.WeightedVoteOption=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.gov.v1.WeightedVoteOption}
 */
proto.cosmos.gov.v1.MsgVoteWeighted.prototype.addOptions = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.cosmos.gov.v1.WeightedVoteOption, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.gov.v1.MsgVoteWeighted} returns this
 */
proto.cosmos.gov.v1.MsgVoteWeighted.prototype.clearOptionsList = function() {
  return this.setOptionsList([]);
};


/**
 * optional string metadata = 4;
 * @return {string}
 */
proto.cosmos.gov.v1.MsgVoteWeighted.prototype.getMetadata = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.gov.v1.MsgVoteWeighted} returns this
 */
proto.cosmos.gov.v1.MsgVoteWeighted.prototype.setMetadata = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


