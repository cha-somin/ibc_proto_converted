// source: stride/interchainquery/v1/genesis.proto
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

goog.provide('proto.stride.interchainquery.v1.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.stride.interchainquery.v1.Query');

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
proto.stride.interchainquery.v1.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.stride.interchainquery.v1.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.stride.interchainquery.v1.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.stride.interchainquery.v1.GenesisState.displayName = 'proto.stride.interchainquery.v1.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.stride.interchainquery.v1.GenesisState.repeatedFields_ = [1];



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
proto.stride.interchainquery.v1.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.stride.interchainquery.v1.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.stride.interchainquery.v1.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stride.interchainquery.v1.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    queriesList: jspb.Message.toObjectList(msg.getQueriesList(),
    proto.stride.interchainquery.v1.Query.toObject, includeInstance)
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
 * @return {!proto.stride.interchainquery.v1.GenesisState}
 */
proto.stride.interchainquery.v1.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.stride.interchainquery.v1.GenesisState;
  return proto.stride.interchainquery.v1.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.stride.interchainquery.v1.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.stride.interchainquery.v1.GenesisState}
 */
proto.stride.interchainquery.v1.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.stride.interchainquery.v1.Query;
      reader.readMessage(value,proto.stride.interchainquery.v1.Query.deserializeBinaryFromReader);
      msg.addQueries(value);
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
proto.stride.interchainquery.v1.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.stride.interchainquery.v1.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.stride.interchainquery.v1.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stride.interchainquery.v1.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getQueriesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.stride.interchainquery.v1.Query.serializeBinaryToWriter
    );
  }
};


/**
 * repeated Query queries = 1;
 * @return {!Array<!proto.stride.interchainquery.v1.Query>}
 */
proto.stride.interchainquery.v1.GenesisState.prototype.getQueriesList = function() {
  return /** @type{!Array<!proto.stride.interchainquery.v1.Query>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.stride.interchainquery.v1.Query, 1));
};


/**
 * @param {!Array<!proto.stride.interchainquery.v1.Query>} value
 * @return {!proto.stride.interchainquery.v1.GenesisState} returns this
*/
proto.stride.interchainquery.v1.GenesisState.prototype.setQueriesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.stride.interchainquery.v1.Query=} opt_value
 * @param {number=} opt_index
 * @return {!proto.stride.interchainquery.v1.Query}
 */
proto.stride.interchainquery.v1.GenesisState.prototype.addQueries = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.stride.interchainquery.v1.Query, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.stride.interchainquery.v1.GenesisState} returns this
 */
proto.stride.interchainquery.v1.GenesisState.prototype.clearQueriesList = function() {
  return this.setQueriesList([]);
};


