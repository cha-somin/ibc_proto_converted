// source: stride/epochs/genesis.proto
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

goog.provide('proto.stride.epochs.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.stride.epochs.EpochInfo');

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
proto.stride.epochs.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.stride.epochs.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.stride.epochs.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.stride.epochs.GenesisState.displayName = 'proto.stride.epochs.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.stride.epochs.GenesisState.repeatedFields_ = [1];



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
proto.stride.epochs.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.stride.epochs.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.stride.epochs.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stride.epochs.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    epochsList: jspb.Message.toObjectList(msg.getEpochsList(),
    proto.stride.epochs.EpochInfo.toObject, includeInstance)
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
 * @return {!proto.stride.epochs.GenesisState}
 */
proto.stride.epochs.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.stride.epochs.GenesisState;
  return proto.stride.epochs.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.stride.epochs.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.stride.epochs.GenesisState}
 */
proto.stride.epochs.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.stride.epochs.EpochInfo;
      reader.readMessage(value,proto.stride.epochs.EpochInfo.deserializeBinaryFromReader);
      msg.addEpochs(value);
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
proto.stride.epochs.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.stride.epochs.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.stride.epochs.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stride.epochs.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getEpochsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.stride.epochs.EpochInfo.serializeBinaryToWriter
    );
  }
};


/**
 * repeated EpochInfo epochs = 1;
 * @return {!Array<!proto.stride.epochs.EpochInfo>}
 */
proto.stride.epochs.GenesisState.prototype.getEpochsList = function() {
  return /** @type{!Array<!proto.stride.epochs.EpochInfo>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.stride.epochs.EpochInfo, 1));
};


/**
 * @param {!Array<!proto.stride.epochs.EpochInfo>} value
 * @return {!proto.stride.epochs.GenesisState} returns this
*/
proto.stride.epochs.GenesisState.prototype.setEpochsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.stride.epochs.EpochInfo=} opt_value
 * @param {number=} opt_index
 * @return {!proto.stride.epochs.EpochInfo}
 */
proto.stride.epochs.GenesisState.prototype.addEpochs = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.stride.epochs.EpochInfo, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.stride.epochs.GenesisState} returns this
 */
proto.stride.epochs.GenesisState.prototype.clearEpochsList = function() {
  return this.setEpochsList([]);
};


