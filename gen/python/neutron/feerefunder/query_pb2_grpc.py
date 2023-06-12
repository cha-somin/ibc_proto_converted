# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from neutron.feerefunder import query_pb2 as neutron_dot_feerefunder_dot_query__pb2


class QueryStub(object):
    """Query defines the gRPC querier service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Params = channel.unary_unary(
                '/neutron.feerefunder.Query/Params',
                request_serializer=neutron_dot_feerefunder_dot_query__pb2.QueryParamsRequest.SerializeToString,
                response_deserializer=neutron_dot_feerefunder_dot_query__pb2.QueryParamsResponse.FromString,
                )
        self.FeeInfo = channel.unary_unary(
                '/neutron.feerefunder.Query/FeeInfo',
                request_serializer=neutron_dot_feerefunder_dot_query__pb2.FeeInfoRequest.SerializeToString,
                response_deserializer=neutron_dot_feerefunder_dot_query__pb2.FeeInfoResponse.FromString,
                )


class QueryServicer(object):
    """Query defines the gRPC querier service.
    """

    def Params(self, request, context):
        """Parameters queries the parameters of the module.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def FeeInfo(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Params': grpc.unary_unary_rpc_method_handler(
                    servicer.Params,
                    request_deserializer=neutron_dot_feerefunder_dot_query__pb2.QueryParamsRequest.FromString,
                    response_serializer=neutron_dot_feerefunder_dot_query__pb2.QueryParamsResponse.SerializeToString,
            ),
            'FeeInfo': grpc.unary_unary_rpc_method_handler(
                    servicer.FeeInfo,
                    request_deserializer=neutron_dot_feerefunder_dot_query__pb2.FeeInfoRequest.FromString,
                    response_serializer=neutron_dot_feerefunder_dot_query__pb2.FeeInfoResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'neutron.feerefunder.Query', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Query(object):
    """Query defines the gRPC querier service.
    """

    @staticmethod
    def Params(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/neutron.feerefunder.Query/Params',
            neutron_dot_feerefunder_dot_query__pb2.QueryParamsRequest.SerializeToString,
            neutron_dot_feerefunder_dot_query__pb2.QueryParamsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def FeeInfo(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/neutron.feerefunder.Query/FeeInfo',
            neutron_dot_feerefunder_dot_query__pb2.FeeInfoRequest.SerializeToString,
            neutron_dot_feerefunder_dot_query__pb2.FeeInfoResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
