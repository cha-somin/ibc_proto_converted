// source: tendermint/abci/types.proto
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

goog.provide('proto.tendermint.abci.RequestPrepareProposal');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Timestamp');
goog.require('proto.tendermint.abci.ExtendedCommitInfo');
goog.require('proto.tendermint.abci.Misbehavior');

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
proto.tendermint.abci.RequestPrepareProposal = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.tendermint.abci.RequestPrepareProposal.repeatedFields_, null);
};
goog.inherits(proto.tendermint.abci.RequestPrepareProposal, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.tendermint.abci.RequestPrepareProposal.displayName = 'proto.tendermint.abci.RequestPrepareProposal';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.tendermint.abci.RequestPrepareProposal.repeatedFields_ = [2,4];



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
proto.tendermint.abci.RequestPrepareProposal.prototype.toObject = function(opt_includeInstance) {
  return proto.tendermint.abci.RequestPrepareProposal.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.tendermint.abci.RequestPrepareProposal} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.tendermint.abci.RequestPrepareProposal.toObject = function(includeInstance, msg) {
  var f, obj = {
    maxTxBytes: jspb.Message.getFieldWithDefault(msg, 1, 0),
    txsList: msg.getTxsList_asB64(),
    localLastCommit: (f = msg.getLocalLastCommit()) && proto.tendermint.abci.ExtendedCommitInfo.toObject(includeInstance, f),
    misbehaviorList: jspb.Message.toObjectList(msg.getMisbehaviorList(),
    proto.tendermint.abci.Misbehavior.toObject, includeInstance),
    height: jspb.Message.getFieldWithDefault(msg, 5, 0),
    time: (f = msg.getTime()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    nextValidatorsHash: msg.getNextValidatorsHash_asB64(),
    proposerAddress: msg.getProposerAddress_asB64()
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
 * @return {!proto.tendermint.abci.RequestPrepareProposal}
 */
proto.tendermint.abci.RequestPrepareProposal.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.tendermint.abci.RequestPrepareProposal;
  return proto.tendermint.abci.RequestPrepareProposal.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.tendermint.abci.RequestPrepareProposal} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.tendermint.abci.RequestPrepareProposal}
 */
proto.tendermint.abci.RequestPrepareProposal.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setMaxTxBytes(value);
      break;
    case 2:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.addTxs(value);
      break;
    case 3:
      var value = new proto.tendermint.abci.ExtendedCommitInfo;
      reader.readMessage(value,proto.tendermint.abci.ExtendedCommitInfo.deserializeBinaryFromReader);
      msg.setLocalLastCommit(value);
      break;
    case 4:
      var value = new proto.tendermint.abci.Misbehavior;
      reader.readMessage(value,proto.tendermint.abci.Misbehavior.deserializeBinaryFromReader);
      msg.addMisbehavior(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setHeight(value);
      break;
    case 6:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setTime(value);
      break;
    case 7:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setNextValidatorsHash(value);
      break;
    case 8:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setProposerAddress(value);
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
proto.tendermint.abci.RequestPrepareProposal.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.tendermint.abci.RequestPrepareProposal.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.tendermint.abci.RequestPrepareProposal} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.tendermint.abci.RequestPrepareProposal.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getMaxTxBytes();
  if (f !== 0) {
    writer.writeInt64(
      1,
      f
    );
  }
  f = message.getTxsList_asU8();
  if (f.length > 0) {
    writer.writeRepeatedBytes(
      2,
      f
    );
  }
  f = message.getLocalLastCommit();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.tendermint.abci.ExtendedCommitInfo.serializeBinaryToWriter
    );
  }
  f = message.getMisbehaviorList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.tendermint.abci.Misbehavior.serializeBinaryToWriter
    );
  }
  f = message.getHeight();
  if (f !== 0) {
    writer.writeInt64(
      5,
      f
    );
  }
  f = message.getTime();
  if (f != null) {
    writer.writeMessage(
      6,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getNextValidatorsHash_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      7,
      f
    );
  }
  f = message.getProposerAddress_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      8,
      f
    );
  }
};


/**
 * optional int64 max_tx_bytes = 1;
 * @return {number}
 */
proto.tendermint.abci.RequestPrepareProposal.prototype.getMaxTxBytes = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.tendermint.abci.RequestPrepareProposal} returns this
 */
proto.tendermint.abci.RequestPrepareProposal.prototype.setMaxTxBytes = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * repeated bytes txs = 2;
 * @return {!Array<string>}
 */
proto.tendermint.abci.RequestPrepareProposal.prototype.getTxsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 2));
};


/**
 * repeated bytes txs = 2;
 * This is a type-conversion wrapper around `getTxsList()`
 * @return {!Array<string>}
 */
proto.tendermint.abci.RequestPrepareProposal.prototype.getTxsList_asB64 = function() {
  return /** @type {!Array<string>} */ (jspb.Message.bytesListAsB64(
      this.getTxsList()));
};


/**
 * repeated bytes txs = 2;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getTxsList()`
 * @return {!Array<!Uint8Array>}
 */
proto.tendermint.abci.RequestPrepareProposal.prototype.getTxsList_asU8 = function() {
  return /** @type {!Array<!Uint8Array>} */ (jspb.Message.bytesListAsU8(
      this.getTxsList()));
};


/**
 * @param {!(Array<!Uint8Array>|Array<string>)} value
 * @return {!proto.tendermint.abci.RequestPrepareProposal} returns this
 */
proto.tendermint.abci.RequestPrepareProposal.prototype.setTxsList = function(value) {
  return jspb.Message.setField(this, 2, value || []);
};


/**
 * @param {!(string|Uint8Array)} value
 * @param {number=} opt_index
 * @return {!proto.tendermint.abci.RequestPrepareProposal} returns this
 */
proto.tendermint.abci.RequestPrepareProposal.prototype.addTxs = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 2, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.tendermint.abci.RequestPrepareProposal} returns this
 */
proto.tendermint.abci.RequestPrepareProposal.prototype.clearTxsList = function() {
  return this.setTxsList([]);
};


/**
 * optional ExtendedCommitInfo local_last_commit = 3;
 * @return {?proto.tendermint.abci.ExtendedCommitInfo}
 */
proto.tendermint.abci.RequestPrepareProposal.prototype.getLocalLastCommit = function() {
  return /** @type{?proto.tendermint.abci.ExtendedCommitInfo} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.abci.ExtendedCommitInfo, 3));
};


/**
 * @param {?proto.tendermint.abci.ExtendedCommitInfo|undefined} value
 * @return {!proto.tendermint.abci.RequestPrepareProposal} returns this
*/
proto.tendermint.abci.RequestPrepareProposal.prototype.setLocalLastCommit = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.tendermint.abci.RequestPrepareProposal} returns this
 */
proto.tendermint.abci.RequestPrepareProposal.prototype.clearLocalLastCommit = function() {
  return this.setLocalLastCommit(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.tendermint.abci.RequestPrepareProposal.prototype.hasLocalLastCommit = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * repeated Misbehavior misbehavior = 4;
 * @return {!Array<!proto.tendermint.abci.Misbehavior>}
 */
proto.tendermint.abci.RequestPrepareProposal.prototype.getMisbehaviorList = function() {
  return /** @type{!Array<!proto.tendermint.abci.Misbehavior>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.tendermint.abci.Misbehavior, 4));
};


/**
 * @param {!Array<!proto.tendermint.abci.Misbehavior>} value
 * @return {!proto.tendermint.abci.RequestPrepareProposal} returns this
*/
proto.tendermint.abci.RequestPrepareProposal.prototype.setMisbehaviorList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.tendermint.abci.Misbehavior=} opt_value
 * @param {number=} opt_index
 * @return {!proto.tendermint.abci.Misbehavior}
 */
proto.tendermint.abci.RequestPrepareProposal.prototype.addMisbehavior = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.tendermint.abci.Misbehavior, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.tendermint.abci.RequestPrepareProposal} returns this
 */
proto.tendermint.abci.RequestPrepareProposal.prototype.clearMisbehaviorList = function() {
  return this.setMisbehaviorList([]);
};


/**
 * optional int64 height = 5;
 * @return {number}
 */
proto.tendermint.abci.RequestPrepareProposal.prototype.getHeight = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.tendermint.abci.RequestPrepareProposal} returns this
 */
proto.tendermint.abci.RequestPrepareProposal.prototype.setHeight = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


/**
 * optional google.protobuf.Timestamp time = 6;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.tendermint.abci.RequestPrepareProposal.prototype.getTime = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 6));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.tendermint.abci.RequestPrepareProposal} returns this
*/
proto.tendermint.abci.RequestPrepareProposal.prototype.setTime = function(value) {
  return jspb.Message.setWrapperField(this, 6, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.tendermint.abci.RequestPrepareProposal} returns this
 */
proto.tendermint.abci.RequestPrepareProposal.prototype.clearTime = function() {
  return this.setTime(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.tendermint.abci.RequestPrepareProposal.prototype.hasTime = function() {
  return jspb.Message.getField(this, 6) != null;
};


/**
 * optional bytes next_validators_hash = 7;
 * @return {string}
 */
proto.tendermint.abci.RequestPrepareProposal.prototype.getNextValidatorsHash = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * optional bytes next_validators_hash = 7;
 * This is a type-conversion wrapper around `getNextValidatorsHash()`
 * @return {string}
 */
proto.tendermint.abci.RequestPrepareProposal.prototype.getNextValidatorsHash_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getNextValidatorsHash()));
};


/**
 * optional bytes next_validators_hash = 7;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getNextValidatorsHash()`
 * @return {!Uint8Array}
 */
proto.tendermint.abci.RequestPrepareProposal.prototype.getNextValidatorsHash_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getNextValidatorsHash()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.tendermint.abci.RequestPrepareProposal} returns this
 */
proto.tendermint.abci.RequestPrepareProposal.prototype.setNextValidatorsHash = function(value) {
  return jspb.Message.setProto3BytesField(this, 7, value);
};


/**
 * optional bytes proposer_address = 8;
 * @return {string}
 */
proto.tendermint.abci.RequestPrepareProposal.prototype.getProposerAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 8, ""));
};


/**
 * optional bytes proposer_address = 8;
 * This is a type-conversion wrapper around `getProposerAddress()`
 * @return {string}
 */
proto.tendermint.abci.RequestPrepareProposal.prototype.getProposerAddress_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getProposerAddress()));
};


/**
 * optional bytes proposer_address = 8;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getProposerAddress()`
 * @return {!Uint8Array}
 */
proto.tendermint.abci.RequestPrepareProposal.prototype.getProposerAddress_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getProposerAddress()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.tendermint.abci.RequestPrepareProposal} returns this
 */
proto.tendermint.abci.RequestPrepareProposal.prototype.setProposerAddress = function(value) {
  return jspb.Message.setProto3BytesField(this, 8, value);
};

