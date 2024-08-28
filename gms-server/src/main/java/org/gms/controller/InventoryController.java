package org.gms.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.gms.constants.api.ApiConstant;
import org.gms.model.dto.*;
import org.gms.service.InventoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/inventory")
public class InventoryController {
    private final InventoryService inventoryService;

    @Tag(name = "/inventory/" + ApiConstant.LATEST)
    @Operation(summary = "获取所有背包分类")
    @GetMapping("/" + ApiConstant.LATEST + "/getInventoryTypeList")
    public ResultBody<List<InventoryTypeRtnDTO>> getInventoryTypeList() {
        return ResultBody.success(inventoryService.getInventoryTypeList());
    }

    @Tag(name = "/inventory/" + ApiConstant.LATEST)
    @Operation(summary = "获取背包分类下的所有物品")
    @PostMapping("/" + ApiConstant.LATEST + "/getInventoryList")
    public ResultBody<List<InventorySearchRtnDTO>> getInventoryList(@RequestBody SubmitBody<InventoryTypeRtnDTO> request) {
        return ResultBody.success(inventoryService.getInventoryList(request.getData()));
    }
}
