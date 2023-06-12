// source: kava/committee/v1beta1/genesis.proto
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

goog.provide('proto.kava.committee.v1beta1.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Any');
goog.require('proto.kava.committee.v1beta1.Proposal');
goog.require('proto.kava.committee.v1beta1.Vote');

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
proto.kava.committee.v1beta1.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.kava.committee.v1beta1.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.kava.committee.v1beta1.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kava.committee.v1beta1.GenesisState.displayName = 'proto.kava.committee.v1beta1.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.kava.committee.v1beta1.GenesisState.repeatedFields_ = [2,3,4];



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
proto.kava.committee.v1beta1.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.kava.committee.v1beta1.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kava.committee.v1beta1.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.committee.v1beta1.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    nextProposalId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    committeesList: jspb.Message.toObjectList(msg.getCommitteesList(),
    proto.google.protobuf.Any.toObject, includeInstance),
    proposalsList: jspb.Message.toObjectList(msg.getProposalsList(),
    proto.kava.committee.v1beta1.Proposal.toObject, includeInstance),
    votesList: jspb.Message.toObjectList(msg.getVotesList(),
    proto.kava.committee.v1beta1.Vote.toObject, includeInstance)
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
 * @return {!proto.kava.committee.v1beta1.GenesisState}
 */
proto.kava.committee.v1beta1.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kava.committee.v1beta1.GenesisState;
  return proto.kava.committee.v1beta1.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kava.committee.v1beta1.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kava.committee.v1beta1.GenesisState}
 */
proto.kava.committee.v1beta1.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setNextProposalId(value);
      break;
    case 2:
      var value = new proto.google.protobuf.Any;
      reader.readMessage(value,proto.google.protobuf.Any.deserializeBinaryFromReader);
      msg.addCommittees(value);
      break;
    case 3:
      var value = new proto.kava.committee.v1beta1.Proposal;
      reader.readMessage(value,proto.kava.committee.v1beta1.Proposal.deserializeBinaryFromReader);
      msg.addProposals(value);
      break;
    case 4:
      var value = new proto.kava.committee.v1beta1.Vote;
      reader.readMessage(value,proto.kava.committee.v1beta1.Vote.deserializeBinaryFromReader);
      msg.addVotes(value);
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
proto.kava.committee.v1beta1.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kava.committee.v1beta1.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kava.committee.v1beta1.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.committee.v1beta1.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getNextProposalId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getCommitteesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.google.protobuf.Any.serializeBinaryToWriter
    );
  }
  f = message.getProposalsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.kava.committee.v1beta1.Proposal.serializeBinaryToWriter
    );
  }
  f = message.getVotesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.kava.committee.v1beta1.Vote.serializeBinaryToWriter
    );
  }
};


/**
 * optional uint64 next_proposal_id = 1;
 * @return {number}
 */
proto.kava.committee.v1beta1.GenesisState.prototype.getNextProposalId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.kava.committee.v1beta1.GenesisState} returns this
 */
proto.kava.committee.v1beta1.GenesisState.prototype.setNextProposalId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * repeated google.protobuf.Any committees = 2;
 * @return {!Array<!proto.google.protobuf.Any>}
 */
proto.kava.committee.v1beta1.GenesisState.prototype.getCommitteesList = function() {
  return /** @type{!Array<!proto.google.protobuf.Any>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.google.protobuf.Any, 2));
};


/**
 * @param {!Array<!proto.google.protobuf.Any>} value
 * @return {!proto.kava.committee.v1beta1.GenesisState} returns this
*/
proto.kava.committee.v1beta1.GenesisState.prototype.setCommitteesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.google.protobuf.Any=} opt_value
 * @param {number=} opt_index
 * @return {!proto.google.protobuf.Any}
 */
proto.kava.committee.v1beta1.GenesisState.prototype.addCommittees = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.google.protobuf.Any, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.kava.committee.v1beta1.GenesisState} returns this
 */
proto.kava.committee.v1beta1.GenesisState.prototype.clearCommitteesList = function() {
  return this.setCommitteesList([]);
};


/**
 * repeated Proposal proposals = 3;
 * @return {!Array<!proto.kava.committee.v1beta1.Proposal>}
 */
proto.kava.committee.v1beta1.GenesisState.prototype.getProposalsList = function() {
  return /** @type{!Array<!proto.kava.committee.v1beta1.Proposal>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.kava.committee.v1beta1.Proposal, 3));
};


/**
 * @param {!Array<!proto.kava.committee.v1beta1.Proposal>} value
 * @return {!proto.kava.committee.v1beta1.GenesisState} returns this
*/
proto.kava.committee.v1beta1.GenesisState.prototype.setProposalsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.kava.committee.v1beta1.Proposal=} opt_value
 * @param {number=} opt_index
 * @return {!proto.kava.committee.v1beta1.Proposal}
 */
proto.kava.committee.v1beta1.GenesisState.prototype.addProposals = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.kava.committee.v1beta1.Proposal, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.kava.committee.v1beta1.GenesisState} returns this
 */
proto.kava.committee.v1beta1.GenesisState.prototype.clearProposalsList = function() {
  return this.setProposalsList([]);
};


/**
 * repeated Vote votes = 4;
 * @return {!Array<!proto.kava.committee.v1beta1.Vote>}
 */
proto.kava.committee.v1beta1.GenesisState.prototype.getVotesList = function() {
  return /** @type{!Array<!proto.kava.committee.v1beta1.Vote>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.kava.committee.v1beta1.Vote, 4));
};


/**
 * @param {!Array<!proto.kava.committee.v1beta1.Vote>} value
 * @return {!proto.kava.committee.v1beta1.GenesisState} returns this
*/
proto.kava.committee.v1beta1.GenesisState.prototype.setVotesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.kava.committee.v1beta1.Vote=} opt_value
 * @param {number=} opt_index
 * @return {!proto.kava.committee.v1beta1.Vote}
 */
proto.kava.committee.v1beta1.GenesisState.prototype.addVotes = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.kava.committee.v1beta1.Vote, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.kava.committee.v1beta1.GenesisState} returns this
 */
proto.kava.committee.v1beta1.GenesisState.prototype.clearVotesList = function() {
  return this.setVotesList([]);
};


