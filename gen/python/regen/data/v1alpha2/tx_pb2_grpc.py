# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from regen.data.v1alpha2 import tx_pb2 as regen_dot_data_dot_v1alpha2_dot_tx__pb2


class MsgStub(object):
    """Msg is the regen.data.v1alpha1 Msg service
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.AnchorData = channel.unary_unary(
                '/regen.data.v1alpha2.Msg/AnchorData',
                request_serializer=regen_dot_data_dot_v1alpha2_dot_tx__pb2.MsgAnchorData.SerializeToString,
                response_deserializer=regen_dot_data_dot_v1alpha2_dot_tx__pb2.MsgAnchorDataResponse.FromString,
                )
        self.SignData = channel.unary_unary(
                '/regen.data.v1alpha2.Msg/SignData',
                request_serializer=regen_dot_data_dot_v1alpha2_dot_tx__pb2.MsgSignData.SerializeToString,
                response_deserializer=regen_dot_data_dot_v1alpha2_dot_tx__pb2.MsgSignDataResponse.FromString,
                )


class MsgServicer(object):
    """Msg is the regen.data.v1alpha1 Msg service
    """

    def AnchorData(self, request, context):
        """AnchorData "anchors" a piece of data to the blockchain based on its secure
        hash, effectively providing a tamper resistant timestamp.

        The sender in AnchorData is not attesting to the veracity of the underlying
        data. They can simply be a intermediary providing timestamp services.
        SignData should be used to create a digital signature attesting to the
        veracity of some piece of data.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def SignData(self, request, context):
        """SignData allows for signing of an arbitrary piece of data on the
        blockchain. By "signing" data the signers are making a statement about the
        veracity of the data itself. It is like signing a legal document, meaning
        that I agree to all conditions and to the best of my knowledge everything
        is true. When anchoring data, the sender is not attesting to the veracity
        of the data, they are simply communicating that it exists.

        On-chain signatures have the following benefits:
        - on-chain identities can be managed using different cryptographic keys
        that change over time through key rotation practices
        - an on-chain identity may represent an organization and through delegation
        individual members may sign on behalf of the group
        - the blockchain transaction envelope provides built-in replay protection
        and timestamping

        SignData implicitly calls AnchorData if the data was not already anchored.

        SignData can be called multiple times for the same content hash with different
        signers and those signers will be appended to the list of signers.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MsgServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'AnchorData': grpc.unary_unary_rpc_method_handler(
                    servicer.AnchorData,
                    request_deserializer=regen_dot_data_dot_v1alpha2_dot_tx__pb2.MsgAnchorData.FromString,
                    response_serializer=regen_dot_data_dot_v1alpha2_dot_tx__pb2.MsgAnchorDataResponse.SerializeToString,
            ),
            'SignData': grpc.unary_unary_rpc_method_handler(
                    servicer.SignData,
                    request_deserializer=regen_dot_data_dot_v1alpha2_dot_tx__pb2.MsgSignData.FromString,
                    response_serializer=regen_dot_data_dot_v1alpha2_dot_tx__pb2.MsgSignDataResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'regen.data.v1alpha2.Msg', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Msg(object):
    """Msg is the regen.data.v1alpha1 Msg service
    """

    @staticmethod
    def AnchorData(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/regen.data.v1alpha2.Msg/AnchorData',
            regen_dot_data_dot_v1alpha2_dot_tx__pb2.MsgAnchorData.SerializeToString,
            regen_dot_data_dot_v1alpha2_dot_tx__pb2.MsgAnchorDataResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def SignData(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/regen.data.v1alpha2.Msg/SignData',
            regen_dot_data_dot_v1alpha2_dot_tx__pb2.MsgSignData.SerializeToString,
            regen_dot_data_dot_v1alpha2_dot_tx__pb2.MsgSignDataResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
