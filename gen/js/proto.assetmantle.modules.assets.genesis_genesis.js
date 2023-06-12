// source: assetmantle/assets/genesis/genesis.proto
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

goog.provide('proto.assetmantle.modules.assets.genesis.Genesis');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.assetmantle.modules.assets.mappable.Mappable');
goog.require('proto.assetmantle.schema.parameters.base.ParameterList');

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
proto.assetmantle.modules.assets.genesis.Genesis = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.assetmantle.modules.assets.genesis.Genesis.repeatedFields_, null);
};
goog.inherits(proto.assetmantle.modules.assets.genesis.Genesis, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.assetmantle.modules.assets.genesis.Genesis.displayName = 'proto.assetmantle.modules.assets.genesis.Genesis';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.assetmantle.modules.assets.genesis.Genesis.repeatedFields_ = [1];



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
proto.assetmantle.modules.assets.genesis.Genesis.prototype.toObject = function(opt_includeInstance) {
  return proto.assetmantle.modules.assets.genesis.Genesis.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.assetmantle.modules.assets.genesis.Genesis} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.assetmantle.modules.assets.genesis.Genesis.toObject = function(includeInstance, msg) {
  var f, obj = {
    mappablesList: jspb.Message.toObjectList(msg.getMappablesList(),
    proto.assetmantle.modules.assets.mappable.Mappable.toObject, includeInstance),
    parameterList: (f = msg.getParameterList()) && proto.assetmantle.schema.parameters.base.ParameterList.toObject(includeInstance, f)
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
 * @return {!proto.assetmantle.modules.assets.genesis.Genesis}
 */
proto.assetmantle.modules.assets.genesis.Genesis.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.assetmantle.modules.assets.genesis.Genesis;
  return proto.assetmantle.modules.assets.genesis.Genesis.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.assetmantle.modules.assets.genesis.Genesis} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.assetmantle.modules.assets.genesis.Genesis}
 */
proto.assetmantle.modules.assets.genesis.Genesis.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.assetmantle.modules.assets.mappable.Mappable;
      reader.readMessage(value,proto.assetmantle.modules.assets.mappable.Mappable.deserializeBinaryFromReader);
      msg.addMappables(value);
      break;
    case 2:
      var value = new proto.assetmantle.schema.parameters.base.ParameterList;
      reader.readMessage(value,proto.assetmantle.schema.parameters.base.ParameterList.deserializeBinaryFromReader);
      msg.setParameterList(value);
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
proto.assetmantle.modules.assets.genesis.Genesis.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.assetmantle.modules.assets.genesis.Genesis.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.assetmantle.modules.assets.genesis.Genesis} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.assetmantle.modules.assets.genesis.Genesis.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getMappablesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.assetmantle.modules.assets.mappable.Mappable.serializeBinaryToWriter
    );
  }
  f = message.getParameterList();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.assetmantle.schema.parameters.base.ParameterList.serializeBinaryToWriter
    );
  }
};


/**
 * repeated assetmantle.modules.assets.mappable.Mappable mappables = 1;
 * @return {!Array<!proto.assetmantle.modules.assets.mappable.Mappable>}
 */
proto.assetmantle.modules.assets.genesis.Genesis.prototype.getMappablesList = function() {
  return /** @type{!Array<!proto.assetmantle.modules.assets.mappable.Mappable>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.assetmantle.modules.assets.mappable.Mappable, 1));
};


/**
 * @param {!Array<!proto.assetmantle.modules.assets.mappable.Mappable>} value
 * @return {!proto.assetmantle.modules.assets.genesis.Genesis} returns this
*/
proto.assetmantle.modules.assets.genesis.Genesis.prototype.setMappablesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.assetmantle.modules.assets.mappable.Mappable=} opt_value
 * @param {number=} opt_index
 * @return {!proto.assetmantle.modules.assets.mappable.Mappable}
 */
proto.assetmantle.modules.assets.genesis.Genesis.prototype.addMappables = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.assetmantle.modules.assets.mappable.Mappable, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.assetmantle.modules.assets.genesis.Genesis} returns this
 */
proto.assetmantle.modules.assets.genesis.Genesis.prototype.clearMappablesList = function() {
  return this.setMappablesList([]);
};


/**
 * optional assetmantle.schema.parameters.base.ParameterList parameter_list = 2;
 * @return {?proto.assetmantle.schema.parameters.base.ParameterList}
 */
proto.assetmantle.modules.assets.genesis.Genesis.prototype.getParameterList = function() {
  return /** @type{?proto.assetmantle.schema.parameters.base.ParameterList} */ (
    jspb.Message.getWrapperField(this, proto.assetmantle.schema.parameters.base.ParameterList, 2));
};


/**
 * @param {?proto.assetmantle.schema.parameters.base.ParameterList|undefined} value
 * @return {!proto.assetmantle.modules.assets.genesis.Genesis} returns this
*/
proto.assetmantle.modules.assets.genesis.Genesis.prototype.setParameterList = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.assetmantle.modules.assets.genesis.Genesis} returns this
 */
proto.assetmantle.modules.assets.genesis.Genesis.prototype.clearParameterList = function() {
  return this.setParameterList(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.assetmantle.modules.assets.genesis.Genesis.prototype.hasParameterList = function() {
  return jspb.Message.getField(this, 2) != null;
};


