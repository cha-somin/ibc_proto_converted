# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from comdex.collector.v1beta1 import query_pb2 as comdex_dot_collector_dot_v1beta1_dot_query__pb2


class QueryStub(object):
    """Query defines the gRPC querier service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Params = channel.unary_unary(
                '/comdex.collector.v1beta1.Query/Params',
                request_serializer=comdex_dot_collector_dot_v1beta1_dot_query__pb2.QueryParamsRequest.SerializeToString,
                response_deserializer=comdex_dot_collector_dot_v1beta1_dot_query__pb2.QueryParamsResponse.FromString,
                )
        self.QueryCollectorLookupByApp = channel.unary_unary(
                '/comdex.collector.v1beta1.Query/QueryCollectorLookupByApp',
                request_serializer=comdex_dot_collector_dot_v1beta1_dot_query__pb2.QueryCollectorLookupByAppRequest.SerializeToString,
                response_deserializer=comdex_dot_collector_dot_v1beta1_dot_query__pb2.QueryCollectorLookupByAppResponse.FromString,
                )
        self.QueryCollectorLookupByAppAndAsset = channel.unary_unary(
                '/comdex.collector.v1beta1.Query/QueryCollectorLookupByAppAndAsset',
                request_serializer=comdex_dot_collector_dot_v1beta1_dot_query__pb2.QueryCollectorLookupByAppAndAssetRequest.SerializeToString,
                response_deserializer=comdex_dot_collector_dot_v1beta1_dot_query__pb2.QueryCollectorLookupByAppAndAssetResponse.FromString,
                )
        self.QueryCollectorDataByAppAndAsset = channel.unary_unary(
                '/comdex.collector.v1beta1.Query/QueryCollectorDataByAppAndAsset',
                request_serializer=comdex_dot_collector_dot_v1beta1_dot_query__pb2.QueryCollectorDataByAppAndAssetRequest.SerializeToString,
                response_deserializer=comdex_dot_collector_dot_v1beta1_dot_query__pb2.QueryCollectorDataByAppAndAssetResponse.FromString,
                )
        self.QueryAuctionMappingForAppAndAsset = channel.unary_unary(
                '/comdex.collector.v1beta1.Query/QueryAuctionMappingForAppAndAsset',
                request_serializer=comdex_dot_collector_dot_v1beta1_dot_query__pb2.QueryAuctionMappingForAppAndAssetRequest.SerializeToString,
                response_deserializer=comdex_dot_collector_dot_v1beta1_dot_query__pb2.QueryAuctionMappingForAppAndAssetResponse.FromString,
                )
        self.QueryNetFeeCollectedForAppAndAsset = channel.unary_unary(
                '/comdex.collector.v1beta1.Query/QueryNetFeeCollectedForAppAndAsset',
                request_serializer=comdex_dot_collector_dot_v1beta1_dot_query__pb2.QueryNetFeeCollectedForAppAndAssetRequest.SerializeToString,
                response_deserializer=comdex_dot_collector_dot_v1beta1_dot_query__pb2.QueryNetFeeCollectedForAppAndAssetResponse.FromString,
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

    def QueryCollectorLookupByApp(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def QueryCollectorLookupByAppAndAsset(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def QueryCollectorDataByAppAndAsset(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def QueryAuctionMappingForAppAndAsset(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def QueryNetFeeCollectedForAppAndAsset(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Params': grpc.unary_unary_rpc_method_handler(
                    servicer.Params,
                    request_deserializer=comdex_dot_collector_dot_v1beta1_dot_query__pb2.QueryParamsRequest.FromString,
                    response_serializer=comdex_dot_collector_dot_v1beta1_dot_query__pb2.QueryParamsResponse.SerializeToString,
            ),
            'QueryCollectorLookupByApp': grpc.unary_unary_rpc_method_handler(
                    servicer.QueryCollectorLookupByApp,
                    request_deserializer=comdex_dot_collector_dot_v1beta1_dot_query__pb2.QueryCollectorLookupByAppRequest.FromString,
                    response_serializer=comdex_dot_collector_dot_v1beta1_dot_query__pb2.QueryCollectorLookupByAppResponse.SerializeToString,
            ),
            'QueryCollectorLookupByAppAndAsset': grpc.unary_unary_rpc_method_handler(
                    servicer.QueryCollectorLookupByAppAndAsset,
                    request_deserializer=comdex_dot_collector_dot_v1beta1_dot_query__pb2.QueryCollectorLookupByAppAndAssetRequest.FromString,
                    response_serializer=comdex_dot_collector_dot_v1beta1_dot_query__pb2.QueryCollectorLookupByAppAndAssetResponse.SerializeToString,
            ),
            'QueryCollectorDataByAppAndAsset': grpc.unary_unary_rpc_method_handler(
                    servicer.QueryCollectorDataByAppAndAsset,
                    request_deserializer=comdex_dot_collector_dot_v1beta1_dot_query__pb2.QueryCollectorDataByAppAndAssetRequest.FromString,
                    response_serializer=comdex_dot_collector_dot_v1beta1_dot_query__pb2.QueryCollectorDataByAppAndAssetResponse.SerializeToString,
            ),
            'QueryAuctionMappingForAppAndAsset': grpc.unary_unary_rpc_method_handler(
                    servicer.QueryAuctionMappingForAppAndAsset,
                    request_deserializer=comdex_dot_collector_dot_v1beta1_dot_query__pb2.QueryAuctionMappingForAppAndAssetRequest.FromString,
                    response_serializer=comdex_dot_collector_dot_v1beta1_dot_query__pb2.QueryAuctionMappingForAppAndAssetResponse.SerializeToString,
            ),
            'QueryNetFeeCollectedForAppAndAsset': grpc.unary_unary_rpc_method_handler(
                    servicer.QueryNetFeeCollectedForAppAndAsset,
                    request_deserializer=comdex_dot_collector_dot_v1beta1_dot_query__pb2.QueryNetFeeCollectedForAppAndAssetRequest.FromString,
                    response_serializer=comdex_dot_collector_dot_v1beta1_dot_query__pb2.QueryNetFeeCollectedForAppAndAssetResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'comdex.collector.v1beta1.Query', rpc_method_handlers)
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
        return grpc.experimental.unary_unary(request, target, '/comdex.collector.v1beta1.Query/Params',
            comdex_dot_collector_dot_v1beta1_dot_query__pb2.QueryParamsRequest.SerializeToString,
            comdex_dot_collector_dot_v1beta1_dot_query__pb2.QueryParamsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def QueryCollectorLookupByApp(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/comdex.collector.v1beta1.Query/QueryCollectorLookupByApp',
            comdex_dot_collector_dot_v1beta1_dot_query__pb2.QueryCollectorLookupByAppRequest.SerializeToString,
            comdex_dot_collector_dot_v1beta1_dot_query__pb2.QueryCollectorLookupByAppResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def QueryCollectorLookupByAppAndAsset(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/comdex.collector.v1beta1.Query/QueryCollectorLookupByAppAndAsset',
            comdex_dot_collector_dot_v1beta1_dot_query__pb2.QueryCollectorLookupByAppAndAssetRequest.SerializeToString,
            comdex_dot_collector_dot_v1beta1_dot_query__pb2.QueryCollectorLookupByAppAndAssetResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def QueryCollectorDataByAppAndAsset(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/comdex.collector.v1beta1.Query/QueryCollectorDataByAppAndAsset',
            comdex_dot_collector_dot_v1beta1_dot_query__pb2.QueryCollectorDataByAppAndAssetRequest.SerializeToString,
            comdex_dot_collector_dot_v1beta1_dot_query__pb2.QueryCollectorDataByAppAndAssetResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def QueryAuctionMappingForAppAndAsset(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/comdex.collector.v1beta1.Query/QueryAuctionMappingForAppAndAsset',
            comdex_dot_collector_dot_v1beta1_dot_query__pb2.QueryAuctionMappingForAppAndAssetRequest.SerializeToString,
            comdex_dot_collector_dot_v1beta1_dot_query__pb2.QueryAuctionMappingForAppAndAssetResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def QueryNetFeeCollectedForAppAndAsset(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/comdex.collector.v1beta1.Query/QueryNetFeeCollectedForAppAndAsset',
            comdex_dot_collector_dot_v1beta1_dot_query__pb2.QueryNetFeeCollectedForAppAndAssetRequest.SerializeToString,
            comdex_dot_collector_dot_v1beta1_dot_query__pb2.QueryNetFeeCollectedForAppAndAssetResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
