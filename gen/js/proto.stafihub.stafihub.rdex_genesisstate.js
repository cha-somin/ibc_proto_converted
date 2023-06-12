// source: stafihub/rdex/genesis.proto
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

goog.provide('proto.stafihub.stafihub.rdex.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.stafihub.stafihub.rdex.Params');
goog.require('proto.stafihub.stafihub.rdex.SwapPool');

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
proto.stafihub.stafihub.rdex.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.stafihub.stafihub.rdex.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.stafihub.stafihub.rdex.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.stafihub.stafihub.rdex.GenesisState.displayName = 'proto.stafihub.stafihub.rdex.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.stafihub.stafihub.rdex.GenesisState.repeatedFields_ = [2,3,5];



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
proto.stafihub.stafihub.rdex.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.stafihub.stafihub.rdex.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.stafihub.stafihub.rdex.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stafihub.stafihub.rdex.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    params: (f = msg.getParams()) && proto.stafihub.stafihub.rdex.Params.toObject(includeInstance, f),
    swappoollistList: jspb.Message.toObjectList(msg.getSwappoollistList(),
    proto.stafihub.stafihub.rdex.SwapPool.toObject, includeInstance),
    providerlistList: (f = jspb.Message.getRepeatedField(msg, 3)) == null ? undefined : f,
    providerswitch: jspb.Message.getBooleanFieldWithDefault(msg, 4, false),
    poolcreatorlistList: (f = jspb.Message.getRepeatedField(msg, 5)) == null ? undefined : f
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
 * @return {!proto.stafihub.stafihub.rdex.GenesisState}
 */
proto.stafihub.stafihub.rdex.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.stafihub.stafihub.rdex.GenesisState;
  return proto.stafihub.stafihub.rdex.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.stafihub.stafihub.rdex.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.stafihub.stafihub.rdex.GenesisState}
 */
proto.stafihub.stafihub.rdex.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.stafihub.stafihub.rdex.Params;
      reader.readMessage(value,proto.stafihub.stafihub.rdex.Params.deserializeBinaryFromReader);
      msg.setParams(value);
      break;
    case 2:
      var value = new proto.stafihub.stafihub.rdex.SwapPool;
      reader.readMessage(value,proto.stafihub.stafihub.rdex.SwapPool.deserializeBinaryFromReader);
      msg.addSwappoollist(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.addProviderlist(value);
      break;
    case 4:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setProviderswitch(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.addPoolcreatorlist(value);
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
proto.stafihub.stafihub.rdex.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.stafihub.stafihub.rdex.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.stafihub.stafihub.rdex.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stafihub.stafihub.rdex.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.stafihub.stafihub.rdex.Params.serializeBinaryToWriter
    );
  }
  f = message.getSwappoollistList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.stafihub.stafihub.rdex.SwapPool.serializeBinaryToWriter
    );
  }
  f = message.getProviderlistList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      3,
      f
    );
  }
  f = message.getProviderswitch();
  if (f) {
    writer.writeBool(
      4,
      f
    );
  }
  f = message.getPoolcreatorlistList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      5,
      f
    );
  }
};


/**
 * optional Params params = 1;
 * @return {?proto.stafihub.stafihub.rdex.Params}
 */
proto.stafihub.stafihub.rdex.GenesisState.prototype.getParams = function() {
  return /** @type{?proto.stafihub.stafihub.rdex.Params} */ (
    jspb.Message.getWrapperField(this, proto.stafihub.stafihub.rdex.Params, 1));
};


/**
 * @param {?proto.stafihub.stafihub.rdex.Params|undefined} value
 * @return {!proto.stafihub.stafihub.rdex.GenesisState} returns this
*/
proto.stafihub.stafihub.rdex.GenesisState.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.stafihub.stafihub.rdex.GenesisState} returns this
 */
proto.stafihub.stafihub.rdex.GenesisState.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.stafihub.stafihub.rdex.GenesisState.prototype.hasParams = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * repeated SwapPool swapPoolList = 2;
 * @return {!Array<!proto.stafihub.stafihub.rdex.SwapPool>}
 */
proto.stafihub.stafihub.rdex.GenesisState.prototype.getSwappoollistList = function() {
  return /** @type{!Array<!proto.stafihub.stafihub.rdex.SwapPool>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.stafihub.stafihub.rdex.SwapPool, 2));
};


/**
 * @param {!Array<!proto.stafihub.stafihub.rdex.SwapPool>} value
 * @return {!proto.stafihub.stafihub.rdex.GenesisState} returns this
*/
proto.stafihub.stafihub.rdex.GenesisState.prototype.setSwappoollistList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.stafihub.stafihub.rdex.SwapPool=} opt_value
 * @param {number=} opt_index
 * @return {!proto.stafihub.stafihub.rdex.SwapPool}
 */
proto.stafihub.stafihub.rdex.GenesisState.prototype.addSwappoollist = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.stafihub.stafihub.rdex.SwapPool, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.stafihub.stafihub.rdex.GenesisState} returns this
 */
proto.stafihub.stafihub.rdex.GenesisState.prototype.clearSwappoollistList = function() {
  return this.setSwappoollistList([]);
};


/**
 * repeated string providerList = 3;
 * @return {!Array<string>}
 */
proto.stafihub.stafihub.rdex.GenesisState.prototype.getProviderlistList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 3));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.stafihub.stafihub.rdex.GenesisState} returns this
 */
proto.stafihub.stafihub.rdex.GenesisState.prototype.setProviderlistList = function(value) {
  return jspb.Message.setField(this, 3, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.stafihub.stafihub.rdex.GenesisState} returns this
 */
proto.stafihub.stafihub.rdex.GenesisState.prototype.addProviderlist = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 3, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.stafihub.stafihub.rdex.GenesisState} returns this
 */
proto.stafihub.stafihub.rdex.GenesisState.prototype.clearProviderlistList = function() {
  return this.setProviderlistList([]);
};


/**
 * optional bool providerSwitch = 4;
 * @return {boolean}
 */
proto.stafihub.stafihub.rdex.GenesisState.prototype.getProviderswitch = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 4, false));
};


/**
 * @param {boolean} value
 * @return {!proto.stafihub.stafihub.rdex.GenesisState} returns this
 */
proto.stafihub.stafihub.rdex.GenesisState.prototype.setProviderswitch = function(value) {
  return jspb.Message.setProto3BooleanField(this, 4, value);
};


/**
 * repeated string poolCreatorList = 5;
 * @return {!Array<string>}
 */
proto.stafihub.stafihub.rdex.GenesisState.prototype.getPoolcreatorlistList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 5));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.stafihub.stafihub.rdex.GenesisState} returns this
 */
proto.stafihub.stafihub.rdex.GenesisState.prototype.setPoolcreatorlistList = function(value) {
  return jspb.Message.setField(this, 5, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.stafihub.stafihub.rdex.GenesisState} returns this
 */
proto.stafihub.stafihub.rdex.GenesisState.prototype.addPoolcreatorlist = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 5, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.stafihub.stafihub.rdex.GenesisState} returns this
 */
proto.stafihub.stafihub.rdex.GenesisState.prototype.clearPoolcreatorlistList = function() {
  return this.setPoolcreatorlistList([]);
};


