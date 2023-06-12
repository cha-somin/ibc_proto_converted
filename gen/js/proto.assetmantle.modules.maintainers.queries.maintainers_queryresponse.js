// source: assetmantle/maintainers/queries/maintainers/query_response.proto
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

goog.provide('proto.assetmantle.modules.maintainers.queries.maintainers.QueryResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.assetmantle.modules.maintainers.mappable.Mappable');

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
proto.assetmantle.modules.maintainers.queries.maintainers.QueryResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.assetmantle.modules.maintainers.queries.maintainers.QueryResponse.repeatedFields_, null);
};
goog.inherits(proto.assetmantle.modules.maintainers.queries.maintainers.QueryResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.assetmantle.modules.maintainers.queries.maintainers.QueryResponse.displayName = 'proto.assetmantle.modules.maintainers.queries.maintainers.QueryResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.assetmantle.modules.maintainers.queries.maintainers.QueryResponse.repeatedFields_ = [1];



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
proto.assetmantle.modules.maintainers.queries.maintainers.QueryResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.assetmantle.modules.maintainers.queries.maintainers.QueryResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.assetmantle.modules.maintainers.queries.maintainers.QueryResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.assetmantle.modules.maintainers.queries.maintainers.QueryResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    listList: jspb.Message.toObjectList(msg.getListList(),
    proto.assetmantle.modules.maintainers.mappable.Mappable.toObject, includeInstance)
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
 * @return {!proto.assetmantle.modules.maintainers.queries.maintainers.QueryResponse}
 */
proto.assetmantle.modules.maintainers.queries.maintainers.QueryResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.assetmantle.modules.maintainers.queries.maintainers.QueryResponse;
  return proto.assetmantle.modules.maintainers.queries.maintainers.QueryResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.assetmantle.modules.maintainers.queries.maintainers.QueryResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.assetmantle.modules.maintainers.queries.maintainers.QueryResponse}
 */
proto.assetmantle.modules.maintainers.queries.maintainers.QueryResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.assetmantle.modules.maintainers.mappable.Mappable;
      reader.readMessage(value,proto.assetmantle.modules.maintainers.mappable.Mappable.deserializeBinaryFromReader);
      msg.addList(value);
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
proto.assetmantle.modules.maintainers.queries.maintainers.QueryResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.assetmantle.modules.maintainers.queries.maintainers.QueryResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.assetmantle.modules.maintainers.queries.maintainers.QueryResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.assetmantle.modules.maintainers.queries.maintainers.QueryResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getListList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.assetmantle.modules.maintainers.mappable.Mappable.serializeBinaryToWriter
    );
  }
};


/**
 * repeated assetmantle.modules.maintainers.mappable.Mappable list = 1;
 * @return {!Array<!proto.assetmantle.modules.maintainers.mappable.Mappable>}
 */
proto.assetmantle.modules.maintainers.queries.maintainers.QueryResponse.prototype.getListList = function() {
  return /** @type{!Array<!proto.assetmantle.modules.maintainers.mappable.Mappable>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.assetmantle.modules.maintainers.mappable.Mappable, 1));
};


/**
 * @param {!Array<!proto.assetmantle.modules.maintainers.mappable.Mappable>} value
 * @return {!proto.assetmantle.modules.maintainers.queries.maintainers.QueryResponse} returns this
*/
proto.assetmantle.modules.maintainers.queries.maintainers.QueryResponse.prototype.setListList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.assetmantle.modules.maintainers.mappable.Mappable=} opt_value
 * @param {number=} opt_index
 * @return {!proto.assetmantle.modules.maintainers.mappable.Mappable}
 */
proto.assetmantle.modules.maintainers.queries.maintainers.QueryResponse.prototype.addList = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.assetmantle.modules.maintainers.mappable.Mappable, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.assetmantle.modules.maintainers.queries.maintainers.QueryResponse} returns this
 */
proto.assetmantle.modules.maintainers.queries.maintainers.QueryResponse.prototype.clearListList = function() {
  return this.setListList([]);
};


