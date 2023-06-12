// source: injective/wasmx/v1/query.proto
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

goog.provide('proto.injective.wasmx.v1.QueryModuleStateResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.injective.wasmx.v1.GenesisState');

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
proto.injective.wasmx.v1.QueryModuleStateResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.injective.wasmx.v1.QueryModuleStateResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.wasmx.v1.QueryModuleStateResponse.displayName = 'proto.injective.wasmx.v1.QueryModuleStateResponse';
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
proto.injective.wasmx.v1.QueryModuleStateResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.wasmx.v1.QueryModuleStateResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.wasmx.v1.QueryModuleStateResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.wasmx.v1.QueryModuleStateResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    state: (f = msg.getState()) && proto.injective.wasmx.v1.GenesisState.toObject(includeInstance, f)
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
 * @return {!proto.injective.wasmx.v1.QueryModuleStateResponse}
 */
proto.injective.wasmx.v1.QueryModuleStateResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.wasmx.v1.QueryModuleStateResponse;
  return proto.injective.wasmx.v1.QueryModuleStateResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.wasmx.v1.QueryModuleStateResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.wasmx.v1.QueryModuleStateResponse}
 */
proto.injective.wasmx.v1.QueryModuleStateResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.injective.wasmx.v1.GenesisState;
      reader.readMessage(value,proto.injective.wasmx.v1.GenesisState.deserializeBinaryFromReader);
      msg.setState(value);
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
proto.injective.wasmx.v1.QueryModuleStateResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.wasmx.v1.QueryModuleStateResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.wasmx.v1.QueryModuleStateResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.wasmx.v1.QueryModuleStateResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getState();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.injective.wasmx.v1.GenesisState.serializeBinaryToWriter
    );
  }
};


/**
 * optional GenesisState state = 1;
 * @return {?proto.injective.wasmx.v1.GenesisState}
 */
proto.injective.wasmx.v1.QueryModuleStateResponse.prototype.getState = function() {
  return /** @type{?proto.injective.wasmx.v1.GenesisState} */ (
    jspb.Message.getWrapperField(this, proto.injective.wasmx.v1.GenesisState, 1));
};


/**
 * @param {?proto.injective.wasmx.v1.GenesisState|undefined} value
 * @return {!proto.injective.wasmx.v1.QueryModuleStateResponse} returns this
*/
proto.injective.wasmx.v1.QueryModuleStateResponse.prototype.setState = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.injective.wasmx.v1.QueryModuleStateResponse} returns this
 */
proto.injective.wasmx.v1.QueryModuleStateResponse.prototype.clearState = function() {
  return this.setState(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.injective.wasmx.v1.QueryModuleStateResponse.prototype.hasState = function() {
  return jspb.Message.getField(this, 1) != null;
};


