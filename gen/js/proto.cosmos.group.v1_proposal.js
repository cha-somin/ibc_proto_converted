// source: cosmos/group/v1/types.proto
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

goog.provide('proto.cosmos.group.v1.Proposal');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.group.v1.TallyResult');
goog.require('proto.google.protobuf.Any');
goog.require('proto.google.protobuf.Timestamp');

goog.forwardDeclare('proto.cosmos.group.v1.ProposalExecutorResult');
goog.forwardDeclare('proto.cosmos.group.v1.ProposalStatus');
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
proto.cosmos.group.v1.Proposal = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cosmos.group.v1.Proposal.repeatedFields_, null);
};
goog.inherits(proto.cosmos.group.v1.Proposal, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.group.v1.Proposal.displayName = 'proto.cosmos.group.v1.Proposal';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cosmos.group.v1.Proposal.repeatedFields_ = [4,12];



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
proto.cosmos.group.v1.Proposal.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.group.v1.Proposal.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.group.v1.Proposal} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.group.v1.Proposal.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, 0),
    groupPolicyAddress: jspb.Message.getFieldWithDefault(msg, 2, ""),
    metadata: jspb.Message.getFieldWithDefault(msg, 3, ""),
    proposersList: (f = jspb.Message.getRepeatedField(msg, 4)) == null ? undefined : f,
    submitTime: (f = msg.getSubmitTime()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    groupVersion: jspb.Message.getFieldWithDefault(msg, 6, 0),
    groupPolicyVersion: jspb.Message.getFieldWithDefault(msg, 7, 0),
    status: jspb.Message.getFieldWithDefault(msg, 8, 0),
    finalTallyResult: (f = msg.getFinalTallyResult()) && proto.cosmos.group.v1.TallyResult.toObject(includeInstance, f),
    votingPeriodEnd: (f = msg.getVotingPeriodEnd()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    executorResult: jspb.Message.getFieldWithDefault(msg, 11, 0),
    messagesList: jspb.Message.toObjectList(msg.getMessagesList(),
    proto.google.protobuf.Any.toObject, includeInstance),
    title: jspb.Message.getFieldWithDefault(msg, 13, ""),
    summary: jspb.Message.getFieldWithDefault(msg, 14, "")
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
 * @return {!proto.cosmos.group.v1.Proposal}
 */
proto.cosmos.group.v1.Proposal.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.group.v1.Proposal;
  return proto.cosmos.group.v1.Proposal.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.group.v1.Proposal} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.group.v1.Proposal}
 */
proto.cosmos.group.v1.Proposal.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setGroupPolicyAddress(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setMetadata(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.addProposers(value);
      break;
    case 5:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setSubmitTime(value);
      break;
    case 6:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setGroupVersion(value);
      break;
    case 7:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setGroupPolicyVersion(value);
      break;
    case 8:
      var value = /** @type {!proto.cosmos.group.v1.ProposalStatus} */ (reader.readEnum());
      msg.setStatus(value);
      break;
    case 9:
      var value = new proto.cosmos.group.v1.TallyResult;
      reader.readMessage(value,proto.cosmos.group.v1.TallyResult.deserializeBinaryFromReader);
      msg.setFinalTallyResult(value);
      break;
    case 10:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setVotingPeriodEnd(value);
      break;
    case 11:
      var value = /** @type {!proto.cosmos.group.v1.ProposalExecutorResult} */ (reader.readEnum());
      msg.setExecutorResult(value);
      break;
    case 12:
      var value = new proto.google.protobuf.Any;
      reader.readMessage(value,proto.google.protobuf.Any.deserializeBinaryFromReader);
      msg.addMessages(value);
      break;
    case 13:
      var value = /** @type {string} */ (reader.readString());
      msg.setTitle(value);
      break;
    case 14:
      var value = /** @type {string} */ (reader.readString());
      msg.setSummary(value);
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
proto.cosmos.group.v1.Proposal.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.group.v1.Proposal.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.group.v1.Proposal} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.group.v1.Proposal.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getGroupPolicyAddress();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getMetadata();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getProposersList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      4,
      f
    );
  }
  f = message.getSubmitTime();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getGroupVersion();
  if (f !== 0) {
    writer.writeUint64(
      6,
      f
    );
  }
  f = message.getGroupPolicyVersion();
  if (f !== 0) {
    writer.writeUint64(
      7,
      f
    );
  }
  f = message.getStatus();
  if (f !== 0.0) {
    writer.writeEnum(
      8,
      f
    );
  }
  f = message.getFinalTallyResult();
  if (f != null) {
    writer.writeMessage(
      9,
      f,
      proto.cosmos.group.v1.TallyResult.serializeBinaryToWriter
    );
  }
  f = message.getVotingPeriodEnd();
  if (f != null) {
    writer.writeMessage(
      10,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getExecutorResult();
  if (f !== 0.0) {
    writer.writeEnum(
      11,
      f
    );
  }
  f = message.getMessagesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      12,
      f,
      proto.google.protobuf.Any.serializeBinaryToWriter
    );
  }
  f = message.getTitle();
  if (f.length > 0) {
    writer.writeString(
      13,
      f
    );
  }
  f = message.getSummary();
  if (f.length > 0) {
    writer.writeString(
      14,
      f
    );
  }
};


/**
 * optional uint64 id = 1;
 * @return {number}
 */
proto.cosmos.group.v1.Proposal.prototype.getId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.cosmos.group.v1.Proposal} returns this
 */
proto.cosmos.group.v1.Proposal.prototype.setId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional string group_policy_address = 2;
 * @return {string}
 */
proto.cosmos.group.v1.Proposal.prototype.getGroupPolicyAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.group.v1.Proposal} returns this
 */
proto.cosmos.group.v1.Proposal.prototype.setGroupPolicyAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string metadata = 3;
 * @return {string}
 */
proto.cosmos.group.v1.Proposal.prototype.getMetadata = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.group.v1.Proposal} returns this
 */
proto.cosmos.group.v1.Proposal.prototype.setMetadata = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * repeated string proposers = 4;
 * @return {!Array<string>}
 */
proto.cosmos.group.v1.Proposal.prototype.getProposersList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 4));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.cosmos.group.v1.Proposal} returns this
 */
proto.cosmos.group.v1.Proposal.prototype.setProposersList = function(value) {
  return jspb.Message.setField(this, 4, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.cosmos.group.v1.Proposal} returns this
 */
proto.cosmos.group.v1.Proposal.prototype.addProposers = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 4, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.group.v1.Proposal} returns this
 */
proto.cosmos.group.v1.Proposal.prototype.clearProposersList = function() {
  return this.setProposersList([]);
};


/**
 * optional google.protobuf.Timestamp submit_time = 5;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.cosmos.group.v1.Proposal.prototype.getSubmitTime = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 5));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.cosmos.group.v1.Proposal} returns this
*/
proto.cosmos.group.v1.Proposal.prototype.setSubmitTime = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.group.v1.Proposal} returns this
 */
proto.cosmos.group.v1.Proposal.prototype.clearSubmitTime = function() {
  return this.setSubmitTime(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.group.v1.Proposal.prototype.hasSubmitTime = function() {
  return jspb.Message.getField(this, 5) != null;
};


/**
 * optional uint64 group_version = 6;
 * @return {number}
 */
proto.cosmos.group.v1.Proposal.prototype.getGroupVersion = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 6, 0));
};


/**
 * @param {number} value
 * @return {!proto.cosmos.group.v1.Proposal} returns this
 */
proto.cosmos.group.v1.Proposal.prototype.setGroupVersion = function(value) {
  return jspb.Message.setProto3IntField(this, 6, value);
};


/**
 * optional uint64 group_policy_version = 7;
 * @return {number}
 */
proto.cosmos.group.v1.Proposal.prototype.getGroupPolicyVersion = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 7, 0));
};


/**
 * @param {number} value
 * @return {!proto.cosmos.group.v1.Proposal} returns this
 */
proto.cosmos.group.v1.Proposal.prototype.setGroupPolicyVersion = function(value) {
  return jspb.Message.setProto3IntField(this, 7, value);
};


/**
 * optional ProposalStatus status = 8;
 * @return {!proto.cosmos.group.v1.ProposalStatus}
 */
proto.cosmos.group.v1.Proposal.prototype.getStatus = function() {
  return /** @type {!proto.cosmos.group.v1.ProposalStatus} */ (jspb.Message.getFieldWithDefault(this, 8, 0));
};


/**
 * @param {!proto.cosmos.group.v1.ProposalStatus} value
 * @return {!proto.cosmos.group.v1.Proposal} returns this
 */
proto.cosmos.group.v1.Proposal.prototype.setStatus = function(value) {
  return jspb.Message.setProto3EnumField(this, 8, value);
};


/**
 * optional TallyResult final_tally_result = 9;
 * @return {?proto.cosmos.group.v1.TallyResult}
 */
proto.cosmos.group.v1.Proposal.prototype.getFinalTallyResult = function() {
  return /** @type{?proto.cosmos.group.v1.TallyResult} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.group.v1.TallyResult, 9));
};


/**
 * @param {?proto.cosmos.group.v1.TallyResult|undefined} value
 * @return {!proto.cosmos.group.v1.Proposal} returns this
*/
proto.cosmos.group.v1.Proposal.prototype.setFinalTallyResult = function(value) {
  return jspb.Message.setWrapperField(this, 9, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.group.v1.Proposal} returns this
 */
proto.cosmos.group.v1.Proposal.prototype.clearFinalTallyResult = function() {
  return this.setFinalTallyResult(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.group.v1.Proposal.prototype.hasFinalTallyResult = function() {
  return jspb.Message.getField(this, 9) != null;
};


/**
 * optional google.protobuf.Timestamp voting_period_end = 10;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.cosmos.group.v1.Proposal.prototype.getVotingPeriodEnd = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 10));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.cosmos.group.v1.Proposal} returns this
*/
proto.cosmos.group.v1.Proposal.prototype.setVotingPeriodEnd = function(value) {
  return jspb.Message.setWrapperField(this, 10, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.group.v1.Proposal} returns this
 */
proto.cosmos.group.v1.Proposal.prototype.clearVotingPeriodEnd = function() {
  return this.setVotingPeriodEnd(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.group.v1.Proposal.prototype.hasVotingPeriodEnd = function() {
  return jspb.Message.getField(this, 10) != null;
};


/**
 * optional ProposalExecutorResult executor_result = 11;
 * @return {!proto.cosmos.group.v1.ProposalExecutorResult}
 */
proto.cosmos.group.v1.Proposal.prototype.getExecutorResult = function() {
  return /** @type {!proto.cosmos.group.v1.ProposalExecutorResult} */ (jspb.Message.getFieldWithDefault(this, 11, 0));
};


/**
 * @param {!proto.cosmos.group.v1.ProposalExecutorResult} value
 * @return {!proto.cosmos.group.v1.Proposal} returns this
 */
proto.cosmos.group.v1.Proposal.prototype.setExecutorResult = function(value) {
  return jspb.Message.setProto3EnumField(this, 11, value);
};


/**
 * repeated google.protobuf.Any messages = 12;
 * @return {!Array<!proto.google.protobuf.Any>}
 */
proto.cosmos.group.v1.Proposal.prototype.getMessagesList = function() {
  return /** @type{!Array<!proto.google.protobuf.Any>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.google.protobuf.Any, 12));
};


/**
 * @param {!Array<!proto.google.protobuf.Any>} value
 * @return {!proto.cosmos.group.v1.Proposal} returns this
*/
proto.cosmos.group.v1.Proposal.prototype.setMessagesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 12, value);
};


/**
 * @param {!proto.google.protobuf.Any=} opt_value
 * @param {number=} opt_index
 * @return {!proto.google.protobuf.Any}
 */
proto.cosmos.group.v1.Proposal.prototype.addMessages = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 12, opt_value, proto.google.protobuf.Any, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.group.v1.Proposal} returns this
 */
proto.cosmos.group.v1.Proposal.prototype.clearMessagesList = function() {
  return this.setMessagesList([]);
};


/**
 * optional string title = 13;
 * @return {string}
 */
proto.cosmos.group.v1.Proposal.prototype.getTitle = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 13, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.group.v1.Proposal} returns this
 */
proto.cosmos.group.v1.Proposal.prototype.setTitle = function(value) {
  return jspb.Message.setProto3StringField(this, 13, value);
};


/**
 * optional string summary = 14;
 * @return {string}
 */
proto.cosmos.group.v1.Proposal.prototype.getSummary = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 14, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.group.v1.Proposal} returns this
 */
proto.cosmos.group.v1.Proposal.prototype.setSummary = function(value) {
  return jspb.Message.setProto3StringField(this, 14, value);
};


