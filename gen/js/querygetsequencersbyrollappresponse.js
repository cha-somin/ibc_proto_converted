// source: dymension/sequencer/query.proto
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

goog.provide('proto.dymensionxyz.dymension.sequencer.QueryGetSequencersByRollappResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.dymensionxyz.dymension.sequencer.SequencerInfo');

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
proto.dymensionxyz.dymension.sequencer.QueryGetSequencersByRollappResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.dymensionxyz.dymension.sequencer.QueryGetSequencersByRollappResponse.repeatedFields_, null);
};
goog.inherits(proto.dymensionxyz.dymension.sequencer.QueryGetSequencersByRollappResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.dymensionxyz.dymension.sequencer.QueryGetSequencersByRollappResponse.displayName = 'proto.dymensionxyz.dymension.sequencer.QueryGetSequencersByRollappResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.dymensionxyz.dymension.sequencer.QueryGetSequencersByRollappResponse.repeatedFields_ = [2];



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
proto.dymensionxyz.dymension.sequencer.QueryGetSequencersByRollappResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.dymensionxyz.dymension.sequencer.QueryGetSequencersByRollappResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.dymensionxyz.dymension.sequencer.QueryGetSequencersByRollappResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.dymensionxyz.dymension.sequencer.QueryGetSequencersByRollappResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    rollappid: jspb.Message.getFieldWithDefault(msg, 1, ""),
    sequencerinfolistList: jspb.Message.toObjectList(msg.getSequencerinfolistList(),
    proto.dymensionxyz.dymension.sequencer.SequencerInfo.toObject, includeInstance)
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
 * @return {!proto.dymensionxyz.dymension.sequencer.QueryGetSequencersByRollappResponse}
 */
proto.dymensionxyz.dymension.sequencer.QueryGetSequencersByRollappResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.dymensionxyz.dymension.sequencer.QueryGetSequencersByRollappResponse;
  return proto.dymensionxyz.dymension.sequencer.QueryGetSequencersByRollappResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.dymensionxyz.dymension.sequencer.QueryGetSequencersByRollappResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.dymensionxyz.dymension.sequencer.QueryGetSequencersByRollappResponse}
 */
proto.dymensionxyz.dymension.sequencer.QueryGetSequencersByRollappResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setRollappid(value);
      break;
    case 2:
      var value = new proto.dymensionxyz.dymension.sequencer.SequencerInfo;
      reader.readMessage(value,proto.dymensionxyz.dymension.sequencer.SequencerInfo.deserializeBinaryFromReader);
      msg.addSequencerinfolist(value);
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
proto.dymensionxyz.dymension.sequencer.QueryGetSequencersByRollappResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.dymensionxyz.dymension.sequencer.QueryGetSequencersByRollappResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.dymensionxyz.dymension.sequencer.QueryGetSequencersByRollappResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.dymensionxyz.dymension.sequencer.QueryGetSequencersByRollappResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getRollappid();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getSequencerinfolistList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.dymensionxyz.dymension.sequencer.SequencerInfo.serializeBinaryToWriter
    );
  }
};


/**
 * optional string rollappId = 1;
 * @return {string}
 */
proto.dymensionxyz.dymension.sequencer.QueryGetSequencersByRollappResponse.prototype.getRollappid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.dymensionxyz.dymension.sequencer.QueryGetSequencersByRollappResponse} returns this
 */
proto.dymensionxyz.dymension.sequencer.QueryGetSequencersByRollappResponse.prototype.setRollappid = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * repeated SequencerInfo sequencerInfoList = 2;
 * @return {!Array<!proto.dymensionxyz.dymension.sequencer.SequencerInfo>}
 */
proto.dymensionxyz.dymension.sequencer.QueryGetSequencersByRollappResponse.prototype.getSequencerinfolistList = function() {
  return /** @type{!Array<!proto.dymensionxyz.dymension.sequencer.SequencerInfo>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.dymensionxyz.dymension.sequencer.SequencerInfo, 2));
};


/**
 * @param {!Array<!proto.dymensionxyz.dymension.sequencer.SequencerInfo>} value
 * @return {!proto.dymensionxyz.dymension.sequencer.QueryGetSequencersByRollappResponse} returns this
*/
proto.dymensionxyz.dymension.sequencer.QueryGetSequencersByRollappResponse.prototype.setSequencerinfolistList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.dymensionxyz.dymension.sequencer.SequencerInfo=} opt_value
 * @param {number=} opt_index
 * @return {!proto.dymensionxyz.dymension.sequencer.SequencerInfo}
 */
proto.dymensionxyz.dymension.sequencer.QueryGetSequencersByRollappResponse.prototype.addSequencerinfolist = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.dymensionxyz.dymension.sequencer.SequencerInfo, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.dymensionxyz.dymension.sequencer.QueryGetSequencersByRollappResponse} returns this
 */
proto.dymensionxyz.dymension.sequencer.QueryGetSequencersByRollappResponse.prototype.clearSequencerinfolistList = function() {
  return this.setSequencerinfolistList([]);
};

