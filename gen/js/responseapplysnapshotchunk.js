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

goog.provide('proto.tendermint.abci.ResponseApplySnapshotChunk');
goog.provide('proto.tendermint.abci.ResponseApplySnapshotChunk.Result');

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
proto.tendermint.abci.ResponseApplySnapshotChunk = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.tendermint.abci.ResponseApplySnapshotChunk.repeatedFields_, null);
};
goog.inherits(proto.tendermint.abci.ResponseApplySnapshotChunk, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.tendermint.abci.ResponseApplySnapshotChunk.displayName = 'proto.tendermint.abci.ResponseApplySnapshotChunk';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.tendermint.abci.ResponseApplySnapshotChunk.repeatedFields_ = [2,3];



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
proto.tendermint.abci.ResponseApplySnapshotChunk.prototype.toObject = function(opt_includeInstance) {
  return proto.tendermint.abci.ResponseApplySnapshotChunk.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.tendermint.abci.ResponseApplySnapshotChunk} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.tendermint.abci.ResponseApplySnapshotChunk.toObject = function(includeInstance, msg) {
  var f, obj = {
    result: jspb.Message.getFieldWithDefault(msg, 1, 0),
    refetchChunksList: (f = jspb.Message.getRepeatedField(msg, 2)) == null ? undefined : f,
    rejectSendersList: (f = jspb.Message.getRepeatedField(msg, 3)) == null ? undefined : f
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
 * @return {!proto.tendermint.abci.ResponseApplySnapshotChunk}
 */
proto.tendermint.abci.ResponseApplySnapshotChunk.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.tendermint.abci.ResponseApplySnapshotChunk;
  return proto.tendermint.abci.ResponseApplySnapshotChunk.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.tendermint.abci.ResponseApplySnapshotChunk} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.tendermint.abci.ResponseApplySnapshotChunk}
 */
proto.tendermint.abci.ResponseApplySnapshotChunk.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!proto.tendermint.abci.ResponseApplySnapshotChunk.Result} */ (reader.readEnum());
      msg.setResult(value);
      break;
    case 2:
      var values = /** @type {!Array<number>} */ (reader.isDelimited() ? reader.readPackedUint32() : [reader.readUint32()]);
      for (var i = 0; i < values.length; i++) {
        msg.addRefetchChunks(values[i]);
      }
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.addRejectSenders(value);
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
proto.tendermint.abci.ResponseApplySnapshotChunk.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.tendermint.abci.ResponseApplySnapshotChunk.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.tendermint.abci.ResponseApplySnapshotChunk} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.tendermint.abci.ResponseApplySnapshotChunk.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getResult();
  if (f !== 0.0) {
    writer.writeEnum(
      1,
      f
    );
  }
  f = message.getRefetchChunksList();
  if (f.length > 0) {
    writer.writePackedUint32(
      2,
      f
    );
  }
  f = message.getRejectSendersList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      3,
      f
    );
  }
};


/**
 * @enum {number}
 */
proto.tendermint.abci.ResponseApplySnapshotChunk.Result = {
  UNKNOWN: 0,
  ACCEPT: 1,
  ABORT: 2,
  RETRY: 3,
  RETRY_SNAPSHOT: 4,
  REJECT_SNAPSHOT: 5
};

/**
 * optional Result result = 1;
 * @return {!proto.tendermint.abci.ResponseApplySnapshotChunk.Result}
 */
proto.tendermint.abci.ResponseApplySnapshotChunk.prototype.getResult = function() {
  return /** @type {!proto.tendermint.abci.ResponseApplySnapshotChunk.Result} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {!proto.tendermint.abci.ResponseApplySnapshotChunk.Result} value
 * @return {!proto.tendermint.abci.ResponseApplySnapshotChunk} returns this
 */
proto.tendermint.abci.ResponseApplySnapshotChunk.prototype.setResult = function(value) {
  return jspb.Message.setProto3EnumField(this, 1, value);
};


/**
 * repeated uint32 refetch_chunks = 2;
 * @return {!Array<number>}
 */
proto.tendermint.abci.ResponseApplySnapshotChunk.prototype.getRefetchChunksList = function() {
  return /** @type {!Array<number>} */ (jspb.Message.getRepeatedField(this, 2));
};


/**
 * @param {!Array<number>} value
 * @return {!proto.tendermint.abci.ResponseApplySnapshotChunk} returns this
 */
proto.tendermint.abci.ResponseApplySnapshotChunk.prototype.setRefetchChunksList = function(value) {
  return jspb.Message.setField(this, 2, value || []);
};


/**
 * @param {number} value
 * @param {number=} opt_index
 * @return {!proto.tendermint.abci.ResponseApplySnapshotChunk} returns this
 */
proto.tendermint.abci.ResponseApplySnapshotChunk.prototype.addRefetchChunks = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 2, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.tendermint.abci.ResponseApplySnapshotChunk} returns this
 */
proto.tendermint.abci.ResponseApplySnapshotChunk.prototype.clearRefetchChunksList = function() {
  return this.setRefetchChunksList([]);
};


/**
 * repeated string reject_senders = 3;
 * @return {!Array<string>}
 */
proto.tendermint.abci.ResponseApplySnapshotChunk.prototype.getRejectSendersList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 3));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.tendermint.abci.ResponseApplySnapshotChunk} returns this
 */
proto.tendermint.abci.ResponseApplySnapshotChunk.prototype.setRejectSendersList = function(value) {
  return jspb.Message.setField(this, 3, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.tendermint.abci.ResponseApplySnapshotChunk} returns this
 */
proto.tendermint.abci.ResponseApplySnapshotChunk.prototype.addRejectSenders = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 3, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.tendermint.abci.ResponseApplySnapshotChunk} returns this
 */
proto.tendermint.abci.ResponseApplySnapshotChunk.prototype.clearRejectSendersList = function() {
  return this.setRejectSendersList([]);
};


