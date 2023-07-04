// source: stafihub/relayers/genesis.proto
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

goog.provide('proto.stafihub.stafihub.relayers.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.stafihub.stafihub.relayers.Relayer');
goog.require('proto.stafihub.stafihub.relayers.Threshold');

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
proto.stafihub.stafihub.relayers.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.stafihub.stafihub.relayers.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.stafihub.stafihub.relayers.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.stafihub.stafihub.relayers.GenesisState.displayName = 'proto.stafihub.stafihub.relayers.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.stafihub.stafihub.relayers.GenesisState.repeatedFields_ = [1,2];



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
proto.stafihub.stafihub.relayers.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.stafihub.stafihub.relayers.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.stafihub.stafihub.relayers.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stafihub.stafihub.relayers.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    relayersList: jspb.Message.toObjectList(msg.getRelayersList(),
    proto.stafihub.stafihub.relayers.Relayer.toObject, includeInstance),
    thresholdsList: jspb.Message.toObjectList(msg.getThresholdsList(),
    proto.stafihub.stafihub.relayers.Threshold.toObject, includeInstance)
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
 * @return {!proto.stafihub.stafihub.relayers.GenesisState}
 */
proto.stafihub.stafihub.relayers.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.stafihub.stafihub.relayers.GenesisState;
  return proto.stafihub.stafihub.relayers.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.stafihub.stafihub.relayers.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.stafihub.stafihub.relayers.GenesisState}
 */
proto.stafihub.stafihub.relayers.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.stafihub.stafihub.relayers.Relayer;
      reader.readMessage(value,proto.stafihub.stafihub.relayers.Relayer.deserializeBinaryFromReader);
      msg.addRelayers(value);
      break;
    case 2:
      var value = new proto.stafihub.stafihub.relayers.Threshold;
      reader.readMessage(value,proto.stafihub.stafihub.relayers.Threshold.deserializeBinaryFromReader);
      msg.addThresholds(value);
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
proto.stafihub.stafihub.relayers.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.stafihub.stafihub.relayers.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.stafihub.stafihub.relayers.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stafihub.stafihub.relayers.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getRelayersList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.stafihub.stafihub.relayers.Relayer.serializeBinaryToWriter
    );
  }
  f = message.getThresholdsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.stafihub.stafihub.relayers.Threshold.serializeBinaryToWriter
    );
  }
};


/**
 * repeated Relayer relayers = 1;
 * @return {!Array<!proto.stafihub.stafihub.relayers.Relayer>}
 */
proto.stafihub.stafihub.relayers.GenesisState.prototype.getRelayersList = function() {
  return /** @type{!Array<!proto.stafihub.stafihub.relayers.Relayer>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.stafihub.stafihub.relayers.Relayer, 1));
};


/**
 * @param {!Array<!proto.stafihub.stafihub.relayers.Relayer>} value
 * @return {!proto.stafihub.stafihub.relayers.GenesisState} returns this
*/
proto.stafihub.stafihub.relayers.GenesisState.prototype.setRelayersList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.stafihub.stafihub.relayers.Relayer=} opt_value
 * @param {number=} opt_index
 * @return {!proto.stafihub.stafihub.relayers.Relayer}
 */
proto.stafihub.stafihub.relayers.GenesisState.prototype.addRelayers = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.stafihub.stafihub.relayers.Relayer, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.stafihub.stafihub.relayers.GenesisState} returns this
 */
proto.stafihub.stafihub.relayers.GenesisState.prototype.clearRelayersList = function() {
  return this.setRelayersList([]);
};


/**
 * repeated Threshold thresholds = 2;
 * @return {!Array<!proto.stafihub.stafihub.relayers.Threshold>}
 */
proto.stafihub.stafihub.relayers.GenesisState.prototype.getThresholdsList = function() {
  return /** @type{!Array<!proto.stafihub.stafihub.relayers.Threshold>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.stafihub.stafihub.relayers.Threshold, 2));
};


/**
 * @param {!Array<!proto.stafihub.stafihub.relayers.Threshold>} value
 * @return {!proto.stafihub.stafihub.relayers.GenesisState} returns this
*/
proto.stafihub.stafihub.relayers.GenesisState.prototype.setThresholdsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.stafihub.stafihub.relayers.Threshold=} opt_value
 * @param {number=} opt_index
 * @return {!proto.stafihub.stafihub.relayers.Threshold}
 */
proto.stafihub.stafihub.relayers.GenesisState.prototype.addThresholds = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.stafihub.stafihub.relayers.Threshold, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.stafihub.stafihub.relayers.GenesisState} returns this
 */
proto.stafihub.stafihub.relayers.GenesisState.prototype.clearThresholdsList = function() {
  return this.setThresholdsList([]);
};

