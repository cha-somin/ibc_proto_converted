// source: sentinel/subscription/v2/genesis.proto
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

goog.provide('proto.sentinel.subscription.v2.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.sentinel.subscription.v2.GenesisSubscription');
goog.require('proto.sentinel.subscription.v2.Params');

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
proto.sentinel.subscription.v2.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.sentinel.subscription.v2.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.sentinel.subscription.v2.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.sentinel.subscription.v2.GenesisState.displayName = 'proto.sentinel.subscription.v2.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.sentinel.subscription.v2.GenesisState.repeatedFields_ = [1];



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
proto.sentinel.subscription.v2.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.sentinel.subscription.v2.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.sentinel.subscription.v2.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.sentinel.subscription.v2.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    subscriptionsList: jspb.Message.toObjectList(msg.getSubscriptionsList(),
    proto.sentinel.subscription.v2.GenesisSubscription.toObject, includeInstance),
    params: (f = msg.getParams()) && proto.sentinel.subscription.v2.Params.toObject(includeInstance, f)
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
 * @return {!proto.sentinel.subscription.v2.GenesisState}
 */
proto.sentinel.subscription.v2.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.sentinel.subscription.v2.GenesisState;
  return proto.sentinel.subscription.v2.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.sentinel.subscription.v2.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.sentinel.subscription.v2.GenesisState}
 */
proto.sentinel.subscription.v2.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.sentinel.subscription.v2.GenesisSubscription;
      reader.readMessage(value,proto.sentinel.subscription.v2.GenesisSubscription.deserializeBinaryFromReader);
      msg.addSubscriptions(value);
      break;
    case 2:
      var value = new proto.sentinel.subscription.v2.Params;
      reader.readMessage(value,proto.sentinel.subscription.v2.Params.deserializeBinaryFromReader);
      msg.setParams(value);
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
proto.sentinel.subscription.v2.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.sentinel.subscription.v2.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.sentinel.subscription.v2.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.sentinel.subscription.v2.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSubscriptionsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.sentinel.subscription.v2.GenesisSubscription.serializeBinaryToWriter
    );
  }
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.sentinel.subscription.v2.Params.serializeBinaryToWriter
    );
  }
};


/**
 * repeated GenesisSubscription subscriptions = 1;
 * @return {!Array<!proto.sentinel.subscription.v2.GenesisSubscription>}
 */
proto.sentinel.subscription.v2.GenesisState.prototype.getSubscriptionsList = function() {
  return /** @type{!Array<!proto.sentinel.subscription.v2.GenesisSubscription>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.sentinel.subscription.v2.GenesisSubscription, 1));
};


/**
 * @param {!Array<!proto.sentinel.subscription.v2.GenesisSubscription>} value
 * @return {!proto.sentinel.subscription.v2.GenesisState} returns this
*/
proto.sentinel.subscription.v2.GenesisState.prototype.setSubscriptionsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.sentinel.subscription.v2.GenesisSubscription=} opt_value
 * @param {number=} opt_index
 * @return {!proto.sentinel.subscription.v2.GenesisSubscription}
 */
proto.sentinel.subscription.v2.GenesisState.prototype.addSubscriptions = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.sentinel.subscription.v2.GenesisSubscription, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.sentinel.subscription.v2.GenesisState} returns this
 */
proto.sentinel.subscription.v2.GenesisState.prototype.clearSubscriptionsList = function() {
  return this.setSubscriptionsList([]);
};


/**
 * optional Params params = 2;
 * @return {?proto.sentinel.subscription.v2.Params}
 */
proto.sentinel.subscription.v2.GenesisState.prototype.getParams = function() {
  return /** @type{?proto.sentinel.subscription.v2.Params} */ (
    jspb.Message.getWrapperField(this, proto.sentinel.subscription.v2.Params, 2));
};


/**
 * @param {?proto.sentinel.subscription.v2.Params|undefined} value
 * @return {!proto.sentinel.subscription.v2.GenesisState} returns this
*/
proto.sentinel.subscription.v2.GenesisState.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.sentinel.subscription.v2.GenesisState} returns this
 */
proto.sentinel.subscription.v2.GenesisState.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.sentinel.subscription.v2.GenesisState.prototype.hasParams = function() {
  return jspb.Message.getField(this, 2) != null;
};


